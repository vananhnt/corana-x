package main.corana.executor;

import com.mongodb.*;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

import com.mongodb.client.model.UpdateOptions;
import org.bson.Document;
import org.bson.conversions.Bson;
import main.corana.utils.Arithmetic;
import main.corana.utils.SysUtils;

import java.util.ArrayList;

public class DBDriver {
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    public static boolean startConnection(String collectionName) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        boolean load = false;
        DBDriver.database = mongoClient.getDatabase("CORANA");
        boolean collectionExists = database.listCollectionNames()
                .into(new ArrayList<String>()).contains(collectionName);
        if (!collectionExists) {
            database.createCollection(collectionName);
            load = true;
        } else {
            database.getCollection(collectionName).drop();
            database.createCollection(collectionName);
        }
        DBDriver.collection = database.getCollection(collectionName);
        return load;
    }

    public static String getValue(String address) {
        String hexStr = address;
        //TODO:28/02/2022 comment the followings
        if (address.matches("[01][01]+") || address.matches("^(0x|0X|#x)?[a-fA-F0-9]+$")) {
            hexStr = Arithmetic.intToHex(Arithmetic.hexToInt(address));
        }
        Document result = DBDriver.collection.find(eq("address", hexStr)).limit(1).first();
        return (result == null) ? "#x00000000" /* SysUtils.addSymVar()*/ : (result.getString("value"));
    }

    public static String getValueOrNull(String address) {
        String hexStr = address;
        if (address.charAt(0) == '#') {
            hexStr = Arithmetic.intToHex(Arithmetic.hexToInt(address));
        }
        Document result = DBDriver.collection.find(eq("address", hexStr)).limit(1).first();
        return (result == null) ? null : result.getString("value");
    }

    public static String getFunctionLabel(String address) {
        Document result = DBDriver.collection.find(eq("address", address)).limit(1).first();
        return (result == null) ? null : result.getString("label");
    }

    public static void addMemoryDocument(String address, String value) {
        Document doc = new Document("address", SysUtils.getAddressValue(address)).append("value", SysUtils.getAddressValue(value)).append("type", "BLOCK");
        collection.insertOne(doc);
    }

    public static void addMemoryDocument(String address, String value, String label) {
        Document doc = new Document("address", SysUtils.getAddressValue(address)).append("value", SysUtils.getAddressValue(value)).append("type", "BLOCK").append("label", label);
        collection.insertOne(doc);
    }


    public static void addResolveJumpSlot(String ptrAddress, String function, boolean... isJumpSlot) {
        Document doc = new Document("address", SysUtils.getAddressValue(ptrAddress)).append("ptr", function).append("type", "ARM_JUMP_SLOT").append("label", "@Base");;
        collection.insertOne(doc);
    }

    public static void updateMemoryDocument(String address, String value) {
        Bson filter = eq("address", SysUtils.getAddressValue(address));
        UpdateOptions options = new UpdateOptions().upsert(true);
        Bson updateOperation = set("value", SysUtils.getAddressValue(value));
        collection.updateOne(filter, updateOperation, options);
    }
    public static void updateResolveJump(String address, String functionPtr, String functionName) {
        Bson filter = eq("address", SysUtils.getAddressValue(address));
        UpdateOptions opts = new UpdateOptions().upsert(true);
        Bson updateOperation = set("value", SysUtils.getAddressValue(functionPtr));
        collection.updateOne(filter, updateOperation, opts);
        updateOperation = set("type", "ARM_JUMP_SLOT");
        collection.updateOne(filter, updateOperation, opts);
        updateOperation = set("label", functionName);
        collection.updateOne(filter, updateOperation, opts);
    }
    public static void updateResolveJump(String address, String functionName) {
        Bson filter = eq("address", SysUtils.getAddressValue(address));
        UpdateOptions opts = new UpdateOptions().upsert(true);
        Bson updateOperation = set("label", functionName);
        collection.updateOne(filter, updateOperation, opts);

    }

    public static void main(String[] args) {
        //startConnection("test");
        //addDocument("0x01", "0xff");
        String result = "x000008e";

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBDriver.database = mongoClient.getDatabase("CORANA");
        String collectionName = "Test";
        boolean collectionExists = database.listCollectionNames()
                .into(new ArrayList<String>()).contains(collectionName);
        if (!collectionExists) {
            database.createCollection(collectionName);
        }
        DBDriver.collection = database.getCollection("test");
        //updateMemoryDocument("#xfefffff4", "r0");
        System.out.println(getValue("fefffff4"));
    }
}
