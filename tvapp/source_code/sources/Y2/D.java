package Y2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class D extends C0145n {

    /* renamed from: s  reason: collision with root package name */
    public final int f4324s;

    public D() {
        super(a(2008, 1));
        this.f4324s = 1;
    }

    public static int a(int i7, int i8) {
        if (i7 == 2000 && i8 == 1) {
            return 2001;
        }
        return i7;
    }

    public static D b(IOException iOException, int i7) {
        int i8;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i8 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i8 = 1004;
        } else if (message != null && p6.l.T(message).matches("cleartext.*not permitted.*")) {
            i8 = 2007;
        } else {
            i8 = 2001;
        }
        if (i8 == 2007) {
            return new D("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new D(iOException, i8, i7);
    }

    public D(IOException iOException, int i7, int i8) {
        super(a(i7, i8), iOException);
        this.f4324s = i8;
    }

    public D(String str, int i7) {
        super(str, a(i7, 1));
        this.f4324s = 1;
    }

    public D(String str, IOException iOException, int i7) {
        super(a(i7, 1), str, iOException);
        this.f4324s = 1;
    }
}
