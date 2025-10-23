package M2;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.K;
import java.util.List;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f2276a = new Object();

    public i a(K k5) {
        String str = k5.f9655B;
        if (str != null) {
            char c5 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c5 = 11;
                        break;
                    }
                    break;
            }
            int i7 = k5.f9672T;
            List list = k5.f9657D;
            switch (c5) {
                case 0:
                    return new O2.a(list);
                case 1:
                    return new P2.b();
                case 2:
                    return new O2.a();
                case 3:
                    return new V2.i();
                case 4:
                    return new U2.a(list);
                case 5:
                    return new R2.a(list);
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                case '\b':
                    return new N2.c(str, i7);
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return new f();
                case '\t':
                    return new N2.g(i7, list);
                case '\n':
                    return new S2.a();
                case 11:
                    return new T2.d();
            }
        }
        throw new IllegalArgumentException(AbstractC0515y1.x("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public boolean b(K k5) {
        String str = k5.f9655B;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return false;
        }
        return true;
    }
}
