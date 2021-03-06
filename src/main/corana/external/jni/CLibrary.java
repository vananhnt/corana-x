package main.corana.external.jni;

import com.sun.jna.Library;
import com.sun.jna.Native;

import com.sun.jna.NativeLong;

import com.sun.jna.ptr.ByReference;
import com.sun.jna.ptr.IntByReference;
import main.corana.external.jni.CStruct.*;

public interface CLibrary extends Library {

    CLibrary INSTANCE = Native.loadLibrary("c", CLibrary.class);

    int gettimeofday(timeval tv, timezone tz);

    //printf (const char __restrict __fmt, ...)
    void printf(String __restrict__fmt, Object... args);

    //int puts(const char *str)
    int puts(String str);

    //int sprintf ( char * str, const char * format, ... );
    int sprintf(char[] str, String format, Object... args);

    //int *__errno_location(void) - not in the source standard; only in the binary standard
    IntByReference __errno_location();

    //int connect(int __fd,sockaddr *__addr,socklen_t __len)
    int connect(int __fd, sockaddr __addr, int len);

    void _exit(int status);

    void _Exit(int status);

    void _flushlbf();

    int __fbufsize(ByReference stream);

    int __flbf(ByReference stream);

    int __fpending(ByReference stream);

    void __fpurge(ByReference stream);

    int __freadable(ByReference stream);

    int __freading(ByReference stream);

    int __fsetlocking(ByReference stream, int type);

    int __fwritable(ByReference stream);

    int __fwriting(ByReference stream);

    long __ppc_get_timebase();

    long __ppc_get_timebase_freq();

    void __ppc_mdoio();

    void __ppc_mdoom();

    void __ppc_set_ppr_low();

    void __ppc_set_ppr_med();

    void __ppc_set_ppr_med_high();

    void __ppc_set_ppr_med_low();

    void __ppc_set_ppr_very_low();

    void __ppc_yield();

    NativeLong a64l(String str64);

    void abort();

    int abs(int j);

    int accept(int sockfd, sockaddr addr, ByReference addrlen);

    int access(String pathname, int mode);

    double acos(double x);

    float acosf(float x);

    double acosh(double x);

    float acoshf(float x);

    double acoshl(NativeLong x);

    double acosl(NativeLong x);

    int addmntent(ByReference stream, mntent mnt);

    int addseverity(int severity, String s);

    int adjtime(timeval delta, timeval olddelta);

    int adjtimex(timex buf);

    int aio_cancel(int fd, aiocb aiocbp);

    int aio_cancel64(int __fildes, aiocb64 __aiocbp);

    int aio_error(aiocb aiocbp);

    int aio_error64(aiocb64 __aiocbp);

    int aio_fsync(int op, aiocb aiocbp);

    int aio_fsync64(int __operation, aiocb64 __aiocbp);

    void aio_init(aioinit init);

    int aio_read(aiocb aiocbp);

    int aio_read64(aiocb64 __aiocbp);

    int aio_return(aiocb aiocbp);

    int aio_return64(aiocb64 __aiocbp);

    int aio_suspend(aiocb[] __list, int __nent);

    int aio_suspend64(aiocb64[] __list, int __nent);

    int aio_write(aiocb aiocbp);

    int aio_write64(aiocb64 __aiocbp);

    int alarm(int seconds);

    void aligned_alloc(int alignment, int size);

    void alloca(int size);

    //    void argp_error(argp_state __state);
//    void argp_failure(argp_state __state);
    int argz_add(String[] argz, int[] argz_len, byte[] str);

    int argz_add_sep(String[] __argz);

    int argz_append(String[] __argz);

    int argz_count(byte[] argz, int argz_len);

    int argz_create(String[] __argz);

    int argz_create_sep(String __string);

    void argz_delete(String[] argz, int[] argz_len, byte[] entry);

    void argz_extract(byte[] argz, int argz_len, byte argv);

    int argz_insert(String[] __argz);

    byte argz_next(byte[] argz, int argz_len, byte[] entry);

    void argz_stringify(byte[] argz, int len, int sep);

    double asin(double x);

    float asinf(float x);

    double asinh(double x);

    float asinhf(float x);

    double asinhl(NativeLong x);

    double asinl(NativeLong x);

    void asserT(int expression);

    void assert_perror(int errnum);

    double atan(double x);

    double atan2(double y, double x);

    float atan2f(float y, float x);

    double atan2l(NativeLong y, NativeLong x);

    float atanf(float x);

    double atanh(double x);

    float atanhf(float x);

    double atanhl(NativeLong x);

    double atanl(NativeLong x);

    //int atexit(void (function);
    double atof(String nptr);

    int atoi(String nptr);

    NativeLong atol(String nptr);

    long atoll(String nptr);

    int backtrace(ByReference buffer, int size);

    byte backtrace_symbols(ByReference buffer, int size);

    void backtrace_symbols_fd(ByReference buffer, int size, int fd);

    byte basename(String __filename);

    int bcmp(ByReference s1, ByReference s2, int n);

    void bcopy(ByReference src, ByReference dest, int n);

    int bind(int __fd, int __addr, int __len);

    ByReference bindtextdomain(String domainname, String dirname);

    byte bind_textdomain_codeset(String __domainname);

    int brk(ByReference addr);

    void bsearch(ByReference __key, ByReference __base);

    int btowc(int c);

    void bzero(ByReference s, int n);

    double cabs(int z);

    float cabsf(int z);

    double cabsl(NativeLong z);

    int cacos(int z);

    int cacosf(int z);

    int cacosh(int z);

    int cacoshf(int z);

    int cacoshl(NativeLong z);

    int cacosl(NativeLong z);

    void calloc(int nmemb, int size);

    byte canonicalize_file_name(String path);

    double carg(int z);

    float cargf(int z);

    double cargl(NativeLong z);

    int casin(int z);

    int casinf(int z);

    int casinh(int z);

    int casinhf(int z);

    int casinhl(NativeLong z);

    int casinl(NativeLong z);

    int catan(int z);

    int catanf(int z);

    int catanh(int z);

    int catanhf(int z);

    int catanhl(NativeLong z);

    int catanl(NativeLong z);

    int catclose(int catalog);

    byte catgets(int __catalog, int __set, int __number);

    int catopen(String name, int flag);

    double cbrt(double x);

    float cbrtf(float x);

    double cbrtl(NativeLong x);

    int ccos(int z);

    int ccosf(int z);

    int ccosh(int z);

    int ccoshf(int z);

    int ccoshl(NativeLong z);

    int ccosl(NativeLong z);

    double ceil(double x);

    float ceilf(float x);

    double ceill(NativeLong x);

    int cexp(int z);

    int cexpf(int z);

    int cexpl(NativeLong z);

    int cfgetispeed(termios termios_p);

    int cfgetospeed(termios termios_p);

    void cfmakeraw(termios termios_p);

    int cfsetispeed(termios termios_p, int speed);

    int cfsetospeed(termios termios_p, int speed);

    int cfsetspeed(termios termios_p, int speed);

    int chdir(String path);

    int chmod(String __file, int __mode);

    int chown(String __file, int __owner, int __group);

    double cimag(int z);

    float cimagf(int z);

    double cimagl(NativeLong z);

    int clearenv();

    void clearerr(ByReference stream);

    void clearerr_unlocked(ByReference stream);

    NativeLong clock();

    int clock_getres(int clockid, timespec res);

    int clock_gettime(int clockid, timespec tp);

    int clock_settime(int clockid, timespec tp);

    int clog(int z);

    int clog10(int z);

    int clog10f(int z);

    int clog10l(NativeLong z);

    int clogf(int z);

    int clogl(NativeLong z);

    int close(int fd);

    int closedir(ByReference dirp);

    void closelog();

    int confstr(int name, byte[] buf, int len);

    int conj(int z);

    int conjf(int z);

    int conjl(NativeLong z);

    double copysign(double x, double y);

    float copysignf(float x, float y);

    double copysignl(NativeLong x, NativeLong y);

    double cos(double x);

    float cosf(float x);

    double cosh(double x);

    float coshf(float x);

    double coshl(NativeLong x);

    double cosl(NativeLong x);

    int cpow(int x, int z);

    int cpowf(int x, int z);

    int cproj(int z);

    int cprojf(int z);

    int cprojl(NativeLong z);

    void CPU_CLR(int cpu, ByReference set);

    int CPU_ISSET(int cpu, ByReference set);

    void CPU_SET(int cpu, ByReference set);

    void CPU_ZERO(ByReference set);

    double creal(int z);

    float crealf(int z);

    double creall(NativeLong z);

    int creat(String pathname, int mode);

    int creat64(String __file, int __mode);

    byte crypt(String __phrase, String __salt);

    byte crypt_r(String __phrase, String __salt);

    int csin(int z);

    int csinf(int z);

    int csinh(int z);

    int csinhf(int z);

    int csinhl(NativeLong z);

    int csinl(NativeLong z);

    int csqrt(int z);

    int csqrtf(int z);

    int csqrtl(NativeLong z);

    int ctan(int z);

    int ctanf(int z);

    int ctanh(int z);

    int ctanhf(int z);

    int ctanhl(NativeLong z);

    int ctanl(NativeLong z);

    byte ctermid(String s);

    byte asctime(tm tm);

    byte asctime_r(tm tm, String buf);

    byte cuserid(String string);

    byte dcgettext(String __domainname);

    byte dcngettext(String __domainname, String __msgid1);

    ByReference dgettext(String domainname, String msgid);

    double difftime(int time1, int time0);

    int dirfd(ByReference dirp);

    byte dirname(String dirname);

    int div(int numerator, int denominator);

    byte dngettext(String __domainname, String __msgid1);

    double drand48();

    int drand48_r(drand48_data buffer, ByReference result);

    double drem(double x, double y);

    float dremf(float x, float y);

    double dreml(NativeLong x, NativeLong y);

    int dup(int oldfd);

    int dup2(int oldfd, int newfd);

    byte ecvt(double number, int ndigits, ByReference decpt, ByReference sign);

    int ecvt_r(double __value, int __ndigit, ByReference __decpt);

    void endfsent();

    void endgrent();

    void endhostent();

    int endmntent(ByReference streamp);

    void endnetent();

    void endnetgrent();

    void endprotoent();

    void endpwent();

    void endservent();

    void endutent();

    int envz_add(String[] __envz);

    byte envz_entry(byte[] envz, int envz_len, byte[] name);

    byte envz_get(byte[] envz, int envz_len, byte[] name);

    int envz_merge(String[] __envz);

    void envz_remove(String[] envz, int[] envz_len, byte[] name);

    void envz_strip(String[] envz, int[] envz_len);

    double erand48(short[] xsubi);

    int erand48_r(int[] __xsubi);

    double erf(double x);

    double erfc(double x);

    float erfcf(float x);

    double erfcl(NativeLong x);

    float erff(float x);

    double erfl(NativeLong x);

    void error_at_line(int __status, int __errnum, String __fname);

    int execv(String pathname);

    int execve(String __path);

    int execvp(String file);

    void exit(int status);

    double exp(double x);

    double exp10(double x);

    float exp10f(float x);

    double exp10l(NativeLong x);

    double exp2(double x);

    float exp2f(float x);

    double exp2l(NativeLong x);

    float expf(float x);

    double expl(NativeLong x);

    void explicit_bzero(ByReference s, int n);

    double expm1(double x);

    float expm1f(float x);

    double expm1l(NativeLong x);

    double fabs(double x);

    float fabsf(float x);

    double fabsl(NativeLong x);

    int fchdir(int fd);

    int fchmod(int fd, int mode);

    int fchown(int fd, int owner, int group);

    int fclose(ByReference stream);

    int fcloseall();

    int fcntl(int fd, int cmd, ByReference ptr);

    byte fcvt(double number, int ndigits, ByReference decpt, ByReference sign);

    int fcvt_r(double __value, int __ndigit, ByReference __decpt);

    int fdatasync(int fd);

    double fdim(double x, double y);

    float fdimf(float x, float y);

    double fdiml(NativeLong x, NativeLong y);

    int fdopen(int fd, String mode);

    int fdopendir(int fd);

    void FD_CLR(int fd, ByReference set);

    int FD_ISSET(int fd, ByReference set);

    void FD_SET(int fd, ByReference set);

    void FD_ZERO(ByReference set);

    int feclearexcept(int excepts);

    int fedisableexcept(int __excepts);

    int feenableexcept(int __excepts);

    int fegetenv(ByReference envp);

    int fegetexceptflag(ByReference flagp, int excepts);

    int fegetmode(ByReference __modep);

    int fegetround();

    int feholdexcept(ByReference envp);

    int feof(ByReference stream);

    int feof_unlocked(ByReference stream);

    int feraiseexcept(int excepts);

    int ferror(ByReference stream);

    int ferror_unlocked(ByReference stream);

    int fesetenv(ByReference envp);

    int fesetexcept(int __excepts);

    int fesetexceptflag(ByReference flagp, int excepts);

    int fesetmode(ByReference __modep);

    int fesetround(int rounding_mode);

    int fetestexcept(int excepts);

    int fetestexceptflag(ByReference __flagp, int __excepts);

    int feupdateenv(ByReference envp);

    int fexecve(int fd);

    int fflush(ByReference stream);

    int fflush_unlocked(ByReference stream);

    int fgetc_unlocked(ByReference stream);

    group fgetgrent(ByReference stream);

    int fgetpos(ByReference stream, ByReference pos);

    passwd fgetpwent(ByReference stream);

    int fgetpwent_r(ByReference __stream);

    byte fgets(String s, int size, ByReference stream);

    byte fgets_unlocked(String s, int n, ByReference stream);

    int fgetwc_unlocked(ByReference stream);

    char fgetws(String ws, int n, ByReference stream);

    char fgetws_unlocked(String ws, int n, ByReference stream);

    int fileno(ByReference stream);

    int fileno_unlocked(ByReference stream);

    int finite(double x);

    int finitef(float x);

    int finitel(NativeLong x);

    void flockfile(ByReference filehandle);

    double floor(double x);

    float floorf(float x);

    double floorl(NativeLong x);

    double fma(double x, double y, double z);

    float fmaf(float x, float y, float z);

    double fmal(NativeLong x, NativeLong y, NativeLong z);

    double fmax(double x, double y);

    int fmemopen(char[] buf, int size, byte[] mode);

    double fmin(double x, double y);

    float fminf(float x, float y);

    double fminl(NativeLong x, NativeLong y);

    double fmod(double x, double y);

    float fmodf(float x, float y);

    double fmodl(NativeLong x, NativeLong y);

    int fnmatch(String pattern, String string, int flags);

    int fopen(String pathname, String mode);

    int fopen64(String __filename);

    int fopencookie(ByReference __magic_cookie);

    int fork();

    int forkpty(ByReference __amaster, String __name);

    int fputc_unlocked(int c, ByReference stream);

    int fputs_unlocked(String s, ByReference stream);


    int fputws(String ws, ByReference stream);

    int fputws_unlocked(String ws, ByReference stream);

    int fread(ByReference ptr, int size, int nmemb, int[] stream);

    int fread_unlocked(ByReference __ptr, int __size);

    void free(ByReference __ptr);

    int freopen(String pathname, String mode, ByReference stream);

    int freopen64(String __filename);

    double frexp(double x, ByReference exp);

    float frexpf(float x, ByReference exp);

    double frexpl(NativeLong x, ByReference exp);

    int fseek(ByReference stream, NativeLong offset, int whence);

    int fseeko(ByReference stream, NativeLong offset, int whence);

    int fsetpos(ByReference stream, ByReference pos);

    int fstat(int fd, stat statbuf);

    int fstat64(int __fd, stat64 __buf);

    int fsync(int fd);

    NativeLong ftell(ByReference stream);

    NativeLong ftello(ByReference stream);

    NativeLong ftello64(ByReference __stream);

    int ftruncate(int fd, NativeLong length);

    int ftruncate64(int __fd, NativeLong __length);

    int ftrylockfile(ByReference filehandle);

    FTW ftw(FTW ftw);

    int ftw64(String __dir, int __func);

    void funlockfile(ByReference filehandle);

    int futimes(int fd, timeval[] tv);

    int fwide(ByReference stream, int mode);

    double gamma(double x);

    float gammaf(float x);

    double gammal(NativeLong x);

    byte gcvt(double number, int ndigit, String buf);

    NativeLong getauxval(NativeLong type);

    int fgetc(ByReference stream);

    int getchar();

    int getchar_unlocked();

    int getcontext(ByReference ucp);

    //int getcpu(ByReference cpu, ByReference node, getcpu_cache tcache);
    byte getcwd(byte[] buf, int size);

    int getc_unlocked(ByReference stream);

    tm getdate(String string);

    int getdate_r(String string, tm res);

    int getdelim(String[] lineptr, int[] n, int delim, int[] stream);

    int getdents64(int __fd, char[] __buffer, int __length);

    int getegid();

    int getentropy(char[] buffer, int length);

    byte getenv(String name);

    int geteuid();

    fstab getfsent();

    fstab getfsfile(String mount_point);

    fstab getfsspec(String special_file);

    int getgid();

    group getgrent();

    group getgrgid(int gid);

    group getgrnam(String name);

    int getgroups(int size);

    hostent gethostbyname(String name);

    hostent gethostbyname2(String name, int af);

    hostent gethostent();

    NativeLong gethostid();

    int gethostname(byte[] name, int len);

    int getitimer(int which, itimerval curr_value);

    int getline(String[] lineptr, int[] n, int[] stream);

    int getloadavg(int nelem);

    byte getlogin();

    mntent getmntent(ByReference stream);

    mntent getmntent_r(ByReference __stream);

    netent getnetbyaddr(int net, int type);

    netent getnetbyname(String name);

    netent getnetent();

    int getnetgrent(String[] host, String[] user, String[] domain);

    int getopt_long(int ___argc, String ___argv);

    int getopt_long_only(int ___argc, String ___argv);

    int getpagesize();

    byte getpass(String prompt);

    int getpeername(int sockfd, sockaddr addr, ByReference addrlen);

    int getpgid(int pid);

    int getpgrp();

    int getpid();

    int getppid();

    int getpriority(int which, int who);

    protoent getprotobyname(String name);

    protoent getprotobynumber(int proto);

    protoent getprotoent();

    int getpt();

    passwd getpwent();

    int getpwent_r(passwd __resultbuf);

    passwd getpwnam(String name);

    int getpwnam_r(String __name);

    passwd getpwuid(int uid);

    int getpwuid_r(int __uid);

    int getrandom(char[] buf, int buflen, int flags);

    int getrlimit(int resource, rlimit rlim);

    int getrlimit64(int __resource);

    int getrusage(int who, rusage usage);

    byte gets(String s);

    servent getservbyname(String name, String proto);

    servent getservbyport(int port, String proto);

    servent getservent();

    int getsid(int pid);

    int getsockname(int sockfd, sockaddr addr, ByReference addrlen);

    int getsockopt(int __fd, int __level, int __optname);

    int getsubopt(String[] optionp, String tokens, String[] valuep);

    byte gettext(String __msgid);

    int gettid();

    //int gettimeofday(timeval tv, timezone tz);
    int getuid();

    int getumask();

    utmp getutent();

    utmp getutid(utmp ut);

    int getutid_r(utmp __id, utmp __buffer);

    utmp getutline(utmp ut);

    int getutline_r(utmp __line);

    void getutmp(utmpx ux, utmp u);

    void getutmpx(utmp u, utmpx ux);

    int getw(ByReference stream);

    int fgetwc(ByReference stream);

    int getwchar();

    int getwchar_unlocked();

    int getwc_unlocked(ByReference stream);

    byte getwd(String buf);

    NativeLong get_avphys_pages();

    byte get_current_dir_name();

    int get_nprocs();

    int get_nprocs_conf();

    NativeLong get_phys_pages();

    int glob64(String __pattern, int __flags);

    void globfree(ByReference pglob);

    void globfree64(ByReference __pglob);

    tm gmtime(ByReference timep);

    tm gmtime_r(ByReference timep, tm result);

    int grantpt(int fd);

    int gsignal(int signum);

    //int gtty(int __fd, sgttyb __params);
    byte hasmntopt(mntent mnt, String opt);

    int hcreate(int nel);

    //int hcreate_r(int nel, hsearch_data htab);
    void hdestroy();

    //void hdestroy_r(hsearch_data htab);
    int hsearch(int item, int action);

    int hsearch_r(int __item, int __action, ByReference __retval);

    int htonl(int hostlong);

    short htons(int hostshort);

    double hypot(double x, double y);

    float hypotf(float x, float y);

    double hypotl(NativeLong x, NativeLong y);

    int iconv_close(int cd);

    int iconv_open(String tocode, String fromcode);

    //void if_freenameindex(if_nameindex ptr);
    byte if_indextoname(int ifindex, String ifname);

    int if_nametoindex(String ifname);

    int ilogb(double x);

    int ilogbf(float x);

    int ilogbl(NativeLong x);

    long imaxabs(int j);

    int imaxdiv(int numerator, int denominator);

    byte index(String s, int c);

    int inet_addr(String cp);

    int inet_aton(String cp, in_addr inp);

    int inet_lnaof(in_addr in);

    in_addr inet_makeaddr(int net, int host);

    int inet_netof(in_addr in);

    int inet_network(String cp);

    byte inet_ntoa(in_addr in);

    byte inet_ntop(int __af, ByReference __cp);

    int inet_pton(int af, String src, ByReference dst);

    int initgroups(String user, int group);

    byte initstate(int seed, byte[] state, int n);

    int initstate_r(int __seed, String __statebuf);

    int isalnum(int c);

    int isalpha(int c);

    int isascii(int c);

    int isatty(int fd);

    int isblank(int c);

    int iscntrl(int c);

    int isdigit(int c);

    int isgraph(int c);

    int isinff(float x);

    int isinfl(NativeLong x);

    int islower(int c);

    int isnanf(float x);

    int isnanl(NativeLong x);

    int isprint(int c);

    int ispunct(int c);

    int isspace(int c);

    int isupper(int c);

    int iswalnum(int wc);

    int iswalpha(int wc);

    int iswblank(int wc);

    int iswcntrl(int wc);

    int iswctype(int wc, NativeLong desc);

    int iswdigit(int wc);

    int iswgraph(int wc);

    int iswlower(int wc);

    int iswprint(int wc);

    int iswpunct(int wc);

    int iswspace(int wc);

    int iswupper(int wc);

    int iswxdigit(int wc);

    int isxdigit(int c);

    double j0(double x);

    float j0f(float x);

    double j0l(NativeLong x);

    double j1(double x);

    float j1f(float x);

    double j1l(NativeLong x);

    double jn(int n, double x);

    float jnf(int n, float x);

    double jnl(int n, NativeLong x);

    NativeLong jrand48(short[] xsubi);

    int jrand48_r(int[] __xsubi);

    int kill(int __pid, int __sig);

    int killpg(int pgrp, int sig);

    byte l64a(NativeLong value);

    NativeLong labs(int j);

    void lcong48(short[] param);

    int lcong48_r(int[] __param);

    double ldexp(double x, int exp);

    float ldexpf(float x, int exp);

    double ldexpl(NativeLong x, int exp);

    int ldiv(NativeLong numerator, NativeLong denominator);

    double lgamma(double x);

    float lgammaf(float x);

    float lgammaf_r(float x, ByReference signp);

    double lgammal(NativeLong x);

    double lgammal_r(NativeLong x, ByReference signp);

    double lgamma_r(double x, ByReference signp);

    short link(int link);

    int linkat(int __fromfd, String __from, int __tofd);

    int lio_listio(int __mode);

    int lio_listio64(int __mode);

    int listen(int sockfd, int backlog);

    long llabs(int j);

    int lldiv(NativeLong numerator, NativeLong denominator);

    long llrint(double x);

    long llrintf(float x);

    long llrintl(NativeLong x);

    long llround(double x);

    long llroundf(float x);

    long llroundl(NativeLong x);

    lconv localeconv();

    tm localtime(ByReference timep);

    tm localtime_r(ByReference timep, tm result);

    double log(double x);

    double log10(double x);

    float log10f(float x);

    double log10l(NativeLong x);

    double log1p(double x);

    float log1pf(float x);

    double log1pl(NativeLong x);

    double log2(double x);

    float log2f(float x);

    double log2l(NativeLong x);

    double logb(double x);

    float logbf(float x);

    double logbl(NativeLong x);

    float logf(float x);

    void login(utmp __entry);

    int login_tty(int fd);

    double logl(NativeLong x);

    int logout(String ut_line);

    void logwtmp(String line, String name, String host);

    void longjmp(int env, int val);

    NativeLong lrand48();

    int lrand48_r(drand48_data buffer, ByReference result);

    NativeLong lrint(double x);

    NativeLong lrintf(float x);

    NativeLong lrintl(NativeLong x);

    NativeLong lround(double x);

    NativeLong lroundf(float x);

    NativeLong lroundl(NativeLong x);

    NativeLong lseek(int fd, NativeLong offset, int whence);

    NativeLong lseek64(int fd, NativeLong offset, int whence);

    int lstat(String pathname, stat statbuf);

    int lstat64(String __file);

    int lutimes(String filename, timeval[] tv);

    int madvise(ByReference addr, int length, int advice);

    int main();

    //void makecontext(ByReference ucp, void (func);
    void mallinfo();

    void malloc(int size);

    int mallopt(int param, int value);

    int mblen(byte[] s, int n);

    int mbrlen(byte[] s, int n, int[] ps);

    int mbrtowc(byte[] pwc, byte[] s, int n, int[] ps);

    int mbsinit(ByReference ps);

    int mbsnrtowcs(String __dst);

    int mbsrtowcs(String __dst);

    int mbstowcs(byte[] dest, byte[] src, int n);

    int mbtowc(byte[] pwc, byte[] s, int n);
    //int mcheck(void (__abortfunc);

    void memccpy(ByReference dest, ByReference src, int c, int n);

    void memchr(ByReference s, int c, int n);

    int memcmp(ByReference s1, ByReference s2, int n);

    void memcpy(ByReference dest, ByReference src, int n);

    int memfd_create(String name, int flags);

    void memfrob(ByReference s, int n);

    void memmem(ByReference __haystack, int __haystacklen);

    void memmove(ByReference dest, ByReference src, int n);

    void mempcpy(ByReference dest, ByReference src, int n);

    void memrchr(ByReference s, int c, int n);

    void memset(ByReference s, int c, int n);

    int mkdir(String __path, int __mode);

    byte mkdtemp(String template);

    int mkfifo(String __path, int __mode);

    int mknod(String __path, int __mode, int __dev);

    int mkstemp(String template);

    byte mktemp(String __template);

    int mktime(tm tm);

    int mlock(ByReference addr, int len);

    int mlock2(ByReference addr, int len, int flags);

    int mlockall(int flags);

    void mmap(ByReference __addr, int __len, int __prot);

    void mmap64(ByReference __addr, int __len, int __prot);

    double modf(double x, ByReference iptr);

    float modff(float x, ByReference iptr);

    double modfl(NativeLong x, ByReference iptr);

    int mount(String __special_file, String __dir);

    int mprotect(ByReference addr, int len, int prot);

    NativeLong mrand48();

    int mrand48_r(drand48_data buffer, ByReference result);

    void mremap(ByReference __addr, int __old_len, int __new_len);

    int msync(ByReference addr, int length, int flags);

    void mtrace();

    int munlock(ByReference addr, int len);

    int munlockall();

    int munmap(ByReference addr, int length);

    void muntrace();

    float nanf(String tagp);

    double nanl(String tagp);

    int nanosleep(timespec req, timespec rem);

    double nearbyint(double x);

    float nearbyintf(float x);

    double nearbyintl(NativeLong x);

    double nextafter(double x, double y);

    float nextafterf(float x, float y);

    double nextafterl(NativeLong x, NativeLong y);

    double nextdown(double x);

    float nextdownf(float x);

    double nextdownl(NativeLong x);

    double nexttoward(double x, NativeLong y);

    float nexttowardf(float x, NativeLong y);

    double nexttowardl(NativeLong x, NativeLong y);

    double nextup(double x);

    float nextupf(float x);

    double nextupl(NativeLong x);

    int nftw(String __dir, int __func, int __descriptors);

    int nftw64(String __dir, int __func);

    byte ngettext(String __msgid1, String __msgid2);

    int nice(int __inc);

    byte nl_langinfo(int item);

    int notfound(int notfound);

    NativeLong nrand48(short[] xsubi);

    int nrand48_r(int[] __xsubi);

    int ntohl(int netlong);

    short ntohs(int netshort);

    int ntp_adjtime(timex buf);

    int ntp_gettime(ntptimeval ntv);

    //    int obstack_printf(obstack __obstack);
//    int obstack_vprintf(obstack __obstack);
//
    int open(String pathname, int flags);

    int opendir(String name);

    void openlog(String ident, int option, int facility);

    int openpty(ByReference __amaster, ByReference __aslave, String __name);

    int open_memstream(String[] ptr, int[] sizeloc);

    int parse_printf_format(byte[] __fmt, int __n);

    NativeLong fpathconf(int fd, int name);

    int pause();

    int pclose(ByReference stream);

    void perror(String s);

    int pipe(int[] pipefd);

    int pkey_alloc(int flags, int access_rights);

    int pkey_free(int pkey);

    int pkey_get(int __key);

    int pkey_mprotect(ByReference addr, int len, int prot, int pkey);

    int pkey_set(int __key, int __access_rights);

    int popen(String command, String type);

    int posix_fallocate(int fd, NativeLong offset, NativeLong len);

    int posix_memalign(ByReference memptr, int alignment, int size);

    double pow(double x, double y);

    float powf(float x, float y);

    double powl(NativeLong x, NativeLong y);

    int pread(int fd, char[] buf, int count, NativeLong offset);

    int pread64(int __fd, char[] __buf, int __nbytes);

    int preadv(int __fd, iovec __iovec, int __count);

    int preadv2(int __fp, iovec __iovec, int __count);

    int preadv64(int __fd, iovec __iovec, int __count);

    int preadv64v2(int __fp, iovec __iovec);

    int printf_size(ByReference __fp);

    int printf_size_info(printf_info __restric);

    void psignal(int sig, String s);

    int pthread_cond_clockwait(ByReference __cond);

    int pthread_getattr_default_np(ByReference attr);

    int pthread_key_create(ByReference __key);

    int pthread_key_delete(int __key);

    int pthread_rwlock_clockrdlock(ByReference __rwlock);

    int pthread_rwlock_clockwrlock(ByReference __rwlock);

    int pthread_setattr_default_np(ByReference attr);

    int pthread_setspecific(int __key, ByReference __value);

    int pthread_tryjoin_np(NativeLong thread, ByReference retval);

    byte ptsname(int fd);

    int ptsname_r(int fd, byte[] buf, int buflen);

    int fputc(int c, ByReference stream);

    int putchar(int c);

    int putchar_unlocked(int c);

    int putc_unlocked(int c, ByReference stream);

    int putenv(String string);

    int putpwent(passwd p, ByReference stream);

    int fputs(String s, ByReference stream);

    utmp pututline(utmp ut);

    int putw(int w, ByReference stream);

    int fputwc(byte wc, ByReference stream);

    int putwchar(byte wc);

    int putwchar_unlocked(byte wc);

    int fputwc_unlocked(byte wc, ByReference stream);

    int pwrite(int fd, char[] buf, int count, NativeLong offset);

    int pwrite64(int __fd, char[] __buf, int __n);

    int pwritev(int __fd, iovec __iovec, int __count);

    int pwritev2(int __fd, iovec __iodev, int __count);

    int pwritev64(int __fd, iovec __iovec, int __count);

    int pwritev64v2(int __fd, iovec __iodev);

    byte qecvt(NativeLong number, int ndigits, ByReference decpt, ByReference sign);

    int qecvt_r(NativeLong __value, int __ndigit);

    byte qfcvt(NativeLong number, int ndigits, ByReference decpt, ByReference sign);

    int qfcvt_r(NativeLong __value, int __ndigit);

    byte qgcvt(NativeLong number, int ndigit, String buf);

    void qsort(ByReference __base, int __nmemb, int __size);

    int raise(int sig);

    int rand();

    NativeLong random();

    int random_r(random_data buf, ByReference result);

    int rand_r(ByReference seedp);

    void rawmemchr(ByReference s, int c);

    int read(int fd, char[] buf, int count);

    //    dirent readdir(ByReference dirp);
//    dirent64 readdir64(ByReference __dirp);
    int readdir64_r(ByReference __dirp);

    int readlink(String __path);

    int readv(int fd, iovec iov, int iovcnt);

    void realloc(ByReference ptr, int size);

    void reallocarray(ByReference ptr, int nmemb, int size);

    byte realpath(String __name);

    int recv(int sockfd, char[] buf, int len, int flags);

    int regcomp(ByReference preg, String regex, int cflags);

    void regfree(ByReference preg);

    int register_printf_function(int __spec, int __func);

    double remainder(double x, double y);

    float remainderf(float x, float y);

    double remainderl(NativeLong x, NativeLong y);

    int remove(String pathname);

    int rename(String oldpath, String newpath);

    void rewind(ByReference stream);

    void rewinddir(ByReference dirp);

    byte rindex(String s, int c);

    double rint(double x);

    float rintf(float x);

    double rintl(NativeLong x);

    int rmdir(String __path);

    double round(double x);

    float roundf(float x);

    double roundl(NativeLong x);

    int rpmatch(String response);

    double scalb(double x, double exp);

    float scalbf(float x, float exp);

    double scalbl(NativeLong x, NativeLong exp);

    double scalbln(double x, int exp);

    float scalblnf(float x, int exp);

    double scalblnl(NativeLong x, int exp);

    double scalbn(double x, int exp);

    float scalbnf(float x, int exp);

    double scalbnl(NativeLong x, int exp);

    int scandir(String __dir);

    int scandir64(String __dir);

    int sched_getaffinity(int __pid, int __cpusetsize);

    int sched_getparam(int pid, sched_param param);

    int sched_getscheduler(int pid);

    int sched_get_priority_max(int policy);

    int sched_get_priority_min(int policy);

    int sched_rr_get_interval(int pid, timespec tp);

    int sched_setaffinity(int __pid, int __cpusetsize);

    int sched_setparam(int pid, sched_param param);

    int sched_setscheduler(int __pid, int __policy);

    int sched_yield();

    byte secure_getenv(String name);

    short seed48(short[] seed16v);

    int seed48_r(int[] __seed16v);

    void seekdir(ByReference dirp, NativeLong loc);

    int semget(int key, int nsems, int semflg);

    int semop(int semid, sembuf sops, int nsops);

    int semtimedop(int __semid, sembuf __sops, int __nsops);

    int sem_clockwait(ByReference __sem);

    int sem_close(ByReference sem);

    int sem_destroy(ByReference sem);

    int sem_getvalue(ByReference sem, ByReference sval);

    int sem_init(ByReference sem, int pshared, int value);

    int sem_post(ByReference sem);

    int sem_timedwait(ByReference sem, timespec abs_timeout);

    int sem_trywait(ByReference sem);

    int sem_unlink(String name);

    int sem_wait(ByReference sem);

    int send(int sockfd, char[] buf, int len, int flags);

    void setbuf(ByReference stream, String buf);

    void setbuffer(int[] stream, byte[] buf, int size);

    int setcontext(ByReference ucp);

    int setdomainname(byte[] name, int len);

    int setegid(int egid);

    int setenv(String name, String value, int overwrite);

    int seteuid(int euid);

    int setfsent();

    int setgid(int gid);

    void setgrent();

    int setgroups(int size, int[] list);

    void sethostent(int stayopen);

    int sethostid(NativeLong hostid);

    int sethostname(byte[] name, int len);

    int setitimer(int __which);

    int setjmp(int env);

    void setlinebuf(ByReference stream);

    byte setlocale(int category, String locale);

    int setlogmask(int mask);

    int setmntent(String filename, String type);

    void setnetent(int stayopen);

    int setnetgrent(String netgroup);

    int setpgid(int pid, int pgid);

    int setpgrp();

    int setpriority(int which, int who, int prio);

    void setprotoent(int stayopen);

    void setpwent();

    int setregid(int rgid, int egid);

    int setreuid(int ruid, int euid);

    int setrlimit(int resource, rlimit rlim);

    int setrlimit64(int __resource);

    void setservent(int stayopen);

    int setsid();

    int setsockopt(int __fd, int __level, int __optname);

    byte setstate(String state);

    int setstate_r(String statebuf, random_data buf);

    int settimeofday(timeval tv, timezone tz);

    int setuid(int uid);

    void setutent();

    int setvbuf(int[] stream, byte[] buf, int mode, int size);

    int shm_open(String name, int oflag, int mode);

    int shm_unlink(String name);

    int shutdown(int __fd, int __how);

    byte sigabbrev_np(int __sig);

    int sigaddset(ByReference set, int signum);

    int sigaltstack(ByReference ss, ByReference old_ss);

    int sigblock(int mask);

    int sigdelset(ByReference set, int signum);

    byte sigdescr_np(int __sig);

    int sigemptyset(ByReference set);

    int sigfillset(ByReference set);

    int siginterrupt(int sig, int flag);

    int sigismember(ByReference set, int signum);

    void siglongjmp(int env, int val);

    int sigmask(int signum);

    int signal(int signum, int handler);

    double significand(double x);

    float significandf(float x);

    double significandl(NativeLong x);

    int sigpause(int sigmask);

    int sigpending(ByReference set);

    int sigprocmask(int how, ByReference set, ByReference oldset);

    int sigsetjmp(int env, int savesigs);

    int sigsetmask(int mask);

    int sigsuspend(ByReference mask);

    double sin(double x);

    void sincos(double x, ByReference sin, ByReference cos);

    void sincosf(float x, ByReference sin, ByReference cos);

    void sincosl(NativeLong x, ByReference sin, ByReference cos);

    float sinf(float x);

    double sinh(double x);

    float sinhf(float x);

    double sinhl(NativeLong x);

    double sinl(NativeLong x);

    int socket(int domain, int type, int protocol);

    int socketpair(int domain, int type, int protocol, int[] sv);

    double sqrt(double x);

    float sqrtf(float x);

    double sqrtl(NativeLong x);

    void srand(int seed);

    void srand48(int seedval);

    int srand48_r(int seedval, drand48_data buffer);

    void srandom(int seed);

    int srandom_r(int seed, random_data buf);

    int ssignal(int signum, int action);

    int stime(ByReference t);

    byte stpcpy(String dest, String src);

    byte stpncpy(byte[] dest, byte[] src, int n);

    int strcasecmp(String s1, String s2);

    byte strcasestr(String haystack, String needle);

    byte strcat(String dest, String src);

    byte strchr(String s, int c);

    byte strchrnul(String s, int c);

    int strcmp(String s1, String s2);

    int strcoll(String s1, String s2);

    byte strcpy(String dest, String src);

    int strcspn(String s, String reject);

    byte strdup(String s);

    byte strdupa(String s);

    byte strerror(int errnum);

    byte strerrordesc_np(int __err);

    byte strerrorname_np(int __err);

    int strerror_r(int errnum, byte[] buf, int buflen);

    int strfromd(byte[] __dest, int __size, byte[] __format);

    int strfromf(byte[] __dest, int __size, byte[] __format);

    int strfroml(byte[] __dest, int __size, byte[] __format);

    byte strfry(String string);

    int strftime(byte[] __s, int __maxsize);

    int strlen(String s);

    int strncasecmp(byte[] s1, byte[] s2, int n);

    byte strncat(byte[] dest, byte[] src, int n);

    int strncmp(byte[] s1, byte[] s2, int n);

    byte strncpy(byte[] dest, byte[] src, int n);

    byte strndup(byte[] s, int n);

    byte strndupa(byte[] s, int n);

    int strnlen(byte[] s, int maxlen);

    byte strpbrk(String s, String accept);

    byte strptime(String s, String format, tm tm);

    byte strrchr(String s, int c);

    byte strsep(String[] stringp, String delim);

    byte strsignal(int sig);

    int strspn(String s, String accept);

    byte strstr(String haystack, String needle);

    double strtod(String nptr, String[] endptr);

    float strtof(String nptr, String[] endptr);

    long strtoimax(String nptr, String[] endptr, int base);

    byte strtok(String str, String delim);

    byte strtok_r(String str, String delim, String[] saveptr);

    NativeLong strtol(String nptr, String[] endptr, int base);

    double strtold(String nptr, String[] endptr);

    long strtoll(String nptr, String[] endptr, int base);

    long strtoq(String __nptr);

    NativeLong strtoul(String nptr, String[] endptr, int base);

    long strtoull(String __nptr);

    long strtoumax(String nptr, String[] endptr, int base);

    long strtouq(String __nptr);

    int strverscmp(String s1, String s2);

    int strxfrm(byte[] dest, byte[] src, int n);

    //int stty(int __fd, sgttyb __params);
    int success(int success);

    int swapcontext(ByReference oucp, ByReference ucp);

    int swprintf(byte[] __s, int __n);

    int swscanf(String __s);

    int symlink(String target, String linkpath);

    int sync(int sync);

    NativeLong sysconf(int name);

    int system(String command);

    int sysv_signal(int signum, int handler);

    double tan(double x);

    float tanf(float x);

    double tanh(double x);

    float tanhf(float x);

    double tanhl(NativeLong x);

    double tanl(NativeLong x);

    int tcdrain(int fd);

    int tcflow(int fd, int action);

    int tcflush(int fd, int queue_selector);

    int tcgetattr(int fd, termios termios_p);

    int tcgetpgrp(int fd);

    int tcgetsid(int fd);

    int tcsendbreak(int fd, int duration);

    int tcsetattr(int __fd, int __optional_actions);

    int tcsetpgrp(int fd, int pgrp);

    //    void tdestroy(ByReference root, void (free_node);
    NativeLong telldir(ByReference dirp);

    byte tempnam(String dir, String pfx);

    ByReference textdomain(String domainname);

    double tgamma(double x);

    float tgammaf(float x);

    double tgammal(NativeLong x);

    int tgkill(int tgid, int tid, int sig);

    void thrd_exit(int __res);

    lc_time_data time(lc_time_data time);

    int timegm(tm tm);

    int timelocal(tm tm);

    NativeLong times(tms buf);

    int tmpfile();

    int tmpfile64();

    byte tmpnam(String s);

    byte tmpnam_r(String s);

    int toascii(int c);

    int tolower(int c);

    int toupper(int c);

    int towctrans(int wc, int desc);

    int towlower(int wc);

    int towupper(int wc);

    double trunc(double x);

    int truncate(String __file, int __length);

    int truncate64(String __file, NativeLong __length);

    float truncf(float x);

    double truncl(NativeLong x);

    int tryagain(int tryagain);

    byte ttyname(int fd);

    int ttyname_r(int fd, byte[] buf, int buflen);

    void tzset();

    NativeLong ulimit(int cmd, NativeLong newlimit);

    int umask(int mask);

    int umount(String __special_file);

    int umount2(String target, int flags);

    int uname(utsname __name);

    int ungetc(int c, ByReference stream);

    int ungetwc(int wc, ByReference stream);

    int unlink(String __name);

    int unlockpt(int fd);

    int unsetenv(String name);

    void updwtmp(String wtmp_file, utmp ut);

    int utime(String filename, utimbuf times);

    int utimes(String filename, timeval[] times);

    int utmpname(String file);

    void valloc(int size);

    int vasprintf(String[] strp, String fmt, int ap);

    void va_copy(int dest, int src);

    void va_end(int ap);

    void verr(int eval, String fmt, int args);

    void verrx(int eval, String fmt, int args);

    int vfork();

    int vfprintf(ByReference stream, String format, int ap);

    int vfscanf(ByReference stream, String format, int ap);

    int vfwprintf(ByReference stream, String format, int args);

    int vlimit(int __resource, int __value);

    int vprintf(String format, int ap);

    int vscanf(String format, int ap);

    int vsnprintf(char[] str, int size, String format, int ap);

    int vsprintf(char[] str, String format, Object[] ap);

    int vsscanf(String str, String format, int ap);

    int vswprintf(byte[] __s, int __n);

    int vswscanf(String __s);

    void vsyslog(int priority, String format, int ap);

    void vwarn(String fmt, int args);

    void vwarnx(String fmt, int args);

    int vwprintf(String format, int args);

    int wait(ByReference wstatus);

    int wait3(ByReference __stat_loc, int __options);

    int wait4(int __pid, ByReference __stat_loc, int __options);

    int waitpid(int pid, ByReference wstatus, int options);

    char wcpcpy(String dest, String src);

    char wcpncpy(byte[] dest, byte[] src, int n);

    int wcrtomb(String s, byte wc, ByReference ps);

    int wcscasecmp(String s1, String s2);

    char wcscat(String dest, String src);

    char wcschr(String wcs, byte wc);

    char wcschrnul(String __s, byte __wc);

    int wcscmp(String s1, String s2);

    int wcscoll(String __s1, String __s2);

    char wcscpy(String dest, String src);

    int wcscspn(String wcs, String reject);

    char wcsdup(String s);

    int wcsftime(byte[] __s, int __maxsize);

    int wcslen(String s);

    int wcsncasecmp(byte[] s1, byte[] s2, int n);

    char wcsncat(byte[] dest, byte[] src, int n);

    int wcsncmp(byte[] s1, byte[] s2, int n);

    char wcsncpy(byte[] dest, byte[] src, int n);

    int wcsnlen(byte[] s, int maxlen);

    int wcsnrtombs(String __dst);

    char wcspbrk(String wcs, String accept);

    char wcsrchr(String wcs, byte wc);

    int wcsrtombs(String __dst);

    int wcsspn(String wcs, String accept);

    char wcsstr(String haystack, String needle);

    double wcstod(String __nptr);

    float wcstof(String __nptr);

    long wcstoimax(String nptr, String endptr, int base);

    char wcstok(String wcs, String delim, String ptr);

    NativeLong wcstol(String __nptr);

    double wcstold(String __nptr);

    long wcstoll(String __nptr);

    int wcstombs(byte[] dest, byte[] src, int n);

    long wcstoq(String __nptr);

    NativeLong wcstoul(String __nptr);

    long wcstoull(String __nptr);

    long wcstoumax(String nptr, String endptr, int base);

    long wcstouq(String __nptr);

    char wcswcs(String __haystack, String __needle);

    int wcsxfrm(String __s1);

    int wctob(int c);

    int wctomb(String s, byte wc);

    int wctrans(String name);

    NativeLong wctype(String name);

    char wmemchr(byte[] s, byte c, int n);

    int wmemcmp(byte[] s1, byte[] s2, int n);

    char wmemcpy(byte[] dest, byte[] src, int n);

    char wmemmove(byte[] dest, byte[] src, int n);

    char wmempcpy(byte[] dest, byte[] src, int n);

    char wmemset(byte[] wcs, byte wc, int n);

    int wordexp(String s, ByReference p, int flags);

    void wordfree(ByReference p);

    int write(ByReference write);

    int writev(int fd, iovec iov, int iovcnt);

    double y0(double x);

    float y0f(float x);

    double y0l(NativeLong x);

    double y1(double x);

    float y1f(float x);

    double y1l(NativeLong x);

    double yn(int n, double x);

    float ynf(int n, float x);

    double ynl(int n, NativeLong x);

}
