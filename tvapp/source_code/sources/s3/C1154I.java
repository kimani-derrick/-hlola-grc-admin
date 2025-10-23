package s3;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.A3;
import com.google.android.gms.internal.measurement.D3;
/* renamed from: s3.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154I extends AbstractC1195q0 {

    /* renamed from: A  reason: collision with root package name */
    public final l6.b f13800A;

    /* renamed from: B  reason: collision with root package name */
    public final l6.b f13801B;

    /* renamed from: C  reason: collision with root package name */
    public final l6.b f13802C;

    /* renamed from: D  reason: collision with root package name */
    public final l6.b f13803D;

    /* renamed from: s  reason: collision with root package name */
    public char f13804s;

    /* renamed from: t  reason: collision with root package name */
    public long f13805t;

    /* renamed from: u  reason: collision with root package name */
    public String f13806u;

    /* renamed from: v  reason: collision with root package name */
    public final l6.b f13807v;

    /* renamed from: w  reason: collision with root package name */
    public final l6.b f13808w;

    /* renamed from: x  reason: collision with root package name */
    public final l6.b f13809x;

    /* renamed from: y  reason: collision with root package name */
    public final l6.b f13810y;

    /* renamed from: z  reason: collision with root package name */
    public final l6.b f13811z;

    public C1154I(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13804s = (char) 0;
        this.f13805t = -1L;
        this.f13807v = new l6.b(this, 6, false, false);
        this.f13808w = new l6.b(this, 6, true, false);
        this.f13809x = new l6.b(this, 6, false, true);
        this.f13810y = new l6.b(this, 5, false, false);
        this.f13811z = new l6.b(this, 5, true, false);
        this.f13800A = new l6.b(this, 5, false, true);
        this.f13801B = new l6.b(this, 4, false, false);
        this.f13802C = new l6.b(this, 3, false, false);
        this.f13803D = new l6.b(this, 2, false, false);
    }

    public static String H(Object obj, boolean z7) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i7 = 0;
        if (obj instanceof Long) {
            if (!z7) {
                return String.valueOf(obj);
            }
            Long l7 = (Long) obj;
            int i8 = (Math.abs(l7.longValue()) > 100L ? 1 : (Math.abs(l7.longValue()) == 100L ? 0 : -1));
            String valueOf = String.valueOf(obj);
            if (i8 < 0) {
                return valueOf;
            }
            if (valueOf.charAt(0) == '-') {
                str = "-";
            }
            String valueOf2 = String.valueOf(Math.abs(l7.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf2.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf2.length()) - 1.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z7) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb = new StringBuilder(th);
                String M6 = M(C1175g0.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i7];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && M(className).equals(M6)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i7++;
                }
                return sb.toString();
            } else if (obj instanceof C1159N) {
                return ((C1159N) obj).f13835a;
            } else {
                if (z7) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    public static String I(boolean z7, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String H6 = H(obj, z7);
        String H7 = H(obj2, z7);
        String H8 = H(obj3, z7);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(H6)) {
            sb.append(str2);
            sb.append(H6);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(H7)) {
            sb.append(str2);
            sb.append(H7);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(H8)) {
            sb.append(str3);
            sb.append(H8);
        }
        return sb.toString();
    }

    public static C1159N J(String str) {
        if (str == null) {
            return null;
        }
        return new C1159N(str);
    }

    public static String M(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            ((D3) A3.f8226r.get()).getClass();
            if (((Boolean) AbstractC1203v.y0.a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    @Override // s3.AbstractC1195q0
    public final boolean G() {
        return false;
    }

    public final void K(int i7, boolean z7, boolean z8, String str, Object obj, Object obj2, Object obj3) {
        if (!z7 && L(i7)) {
            Log.println(i7, R(), I(false, str, obj, obj2, obj3));
        }
        if (!z8 && i7 >= 5) {
            g3.n.g(str);
            C1169d0 c1169d0 = ((C1175g0) this.f2765q).f14065z;
            if (c1169d0 == null) {
                Log.println(6, R(), "Scheduler not set. Not logging error/warn");
            } else if (!c1169d0.f14182r) {
                Log.println(6, R(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= 9) {
                    i7 = 8;
                }
                c1169d0.M(new RunnableC1156K(this, i7, str, obj, obj2, obj3));
            }
        }
    }

    public final boolean L(int i7) {
        return Log.isLoggable(R(), i7);
    }

    public final l6.b N() {
        return this.f13807v;
    }

    public final l6.b O() {
        return this.f13803D;
    }

    public final l6.b P() {
        return this.f13810y;
    }

    public final String Q() {
        long abs;
        Pair pair;
        if (B().f13896v == null) {
            return null;
        }
        U u7 = B().f13896v;
        T t5 = (T) u7.f13910e;
        t5.D();
        t5.D();
        long j7 = ((T) u7.f13910e).N().getLong((String) u7.f13908b, 0L);
        if (j7 == 0) {
            u7.c();
            abs = 0;
        } else {
            ((C1175g0) t5.f2765q).f14037D.getClass();
            abs = Math.abs(j7 - System.currentTimeMillis());
        }
        long j8 = u7.f13907a;
        if (abs >= j8) {
            if (abs > (j8 << 1)) {
                u7.c();
            } else {
                String string = t5.N().getString((String) u7.d, null);
                long j9 = t5.N().getLong((String) u7.f13909c, 0L);
                u7.c();
                if (string != null && j9 > 0) {
                    pair = new Pair(string, Long.valueOf(j9));
                } else {
                    pair = T.f13877Q;
                }
                if (pair != null || pair == T.f13877Q) {
                    return null;
                }
                return String.valueOf(pair.second) + ":" + ((String) pair.first);
            }
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    public final String R() {
        String str;
        synchronized (this) {
            try {
                if (this.f13806u == null) {
                    String str2 = ((C1175g0) this.f2765q).f14059t;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f13806u = str2;
                }
                g3.n.g(this.f13806u);
                str = this.f13806u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
