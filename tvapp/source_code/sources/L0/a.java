package L0;

import android.os.StatFs;
import java.io.File;
import v6.r;
import v6.w;
import w4.l0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public w f1858a;

    /* renamed from: b  reason: collision with root package name */
    public r f1859b;

    /* renamed from: c  reason: collision with root package name */
    public double f1860c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f1861e;
    public d6.c f;

    public final j a() {
        long j7;
        w wVar = this.f1858a;
        if (wVar != null) {
            double d = this.f1860c;
            if (d > 0.0d) {
                try {
                    File d7 = wVar.d();
                    d7.mkdir();
                    StatFs statFs = new StatFs(d7.getAbsolutePath());
                    j7 = l0.e((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.f1861e);
                } catch (Exception unused) {
                    j7 = this.d;
                }
            } else {
                j7 = 0;
            }
            return new j(j7, this.f, this.f1859b, wVar);
        }
        throw new IllegalStateException("directory == null".toString());
    }
}
