package M0;

import H0.q;
import K0.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2148a;

    /* renamed from: b  reason: collision with root package name */
    public final S0.k f2149b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2150c;

    public /* synthetic */ c(Object obj, S0.k kVar, int i7) {
        this.f2148a = i7;
        this.f2150c = obj;
        this.f2149b = kVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, v6.h, v6.f] */
    @Override // M0.g
    public final Object a(D5.d dVar) {
        S0.k kVar = this.f2149b;
        boolean z7 = false;
        Object obj = this.f2150c;
        switch (this.f2148a) {
            case 0:
                return new d(new BitmapDrawable(kVar.f3042a.getResources(), (Bitmap) obj), false, 2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = kVar.f3042a;
                    return new m(new n(obj2, null), null, 2);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Bitmap.Config[] configArr = X0.e.f4059a;
                Drawable drawable = (Drawable) obj;
                z7 = ((drawable instanceof VectorDrawable) || (drawable instanceof q)) ? true : true;
                if (z7) {
                    drawable = new BitmapDrawable(kVar.f3042a.getResources(), android.support.v4.media.session.b.u(drawable, kVar.f3043b, kVar.d, kVar.f3045e, kVar.f));
                }
                return new d(drawable, z7, 2);
        }
    }
}
