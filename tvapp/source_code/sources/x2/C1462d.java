package x2;

import C2.i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.K;
import y2.C1495b;
/* renamed from: x2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1462d f16208a = new Object();

    public final h4.b a(K k5) {
        String str = k5.f9655B;
        if (str != null) {
            str.getClass();
            char c5 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    return new C1495b(0);
                case 1:
                    return new B2.a();
                case 2:
                    return new i(null);
                case 3:
                    return new C1495b(1);
                case 4:
                    return new E2.c();
            }
        }
        throw new IllegalArgumentException(AbstractC0515y1.x("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(K k5) {
        String str = k5.f9655B;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
