package M0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2144a;

    public /* synthetic */ a(int i7) {
        this.f2144a = i7;
    }

    @Override // M0.f
    public final g a(Object obj, S0.k kVar) {
        switch (this.f2144a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!X0.e.e(uri)) {
                    return null;
                }
                return new b(uri, kVar, 0);
            case 1:
                return new c((Bitmap) obj, kVar, 0);
            case 2:
                return new c((ByteBuffer) obj, kVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!M5.g.a(uri2.getScheme(), "content")) {
                    return null;
                }
                return new b(uri2, kVar, 1);
            case 4:
                return new c((Drawable) obj, kVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!M5.g.a(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new b(uri3, kVar, 2);
        }
    }
}
