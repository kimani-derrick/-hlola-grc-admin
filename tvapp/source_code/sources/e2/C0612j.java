package e2;

import H2.C0002c;
import android.content.Context;
import android.os.Handler;
import b3.C0366b;
import g2.InterfaceC0724o;
import java.util.ArrayList;
import u4.C1288l;
import x2.C1464f;
/* renamed from: e2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9990a;

    /* renamed from: b  reason: collision with root package name */
    public final C1288l f9991b = new C1288l(3);

    public C0612j(Context context) {
        this.f9990a = context;
    }

    public final AbstractC0600d[] a(Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y2, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y3, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y4) {
        ArrayList arrayList = new ArrayList();
        C1288l c1288l = this.f9991b;
        Context context = this.f9990a;
        arrayList.add(new a3.i(context, c1288l, handler, surfaceHolder$CallbackC0629y));
        g2.F f = new g2.F(context);
        f.d = false;
        f.f10520e = false;
        f.f = 0;
        if (f.f10519c == null) {
            f.f10519c = new C0002c(new InterfaceC0724o[0]);
        }
        g2.K k5 = new g2.K(f);
        arrayList.add(new g2.N(this.f9990a, this.f9991b, handler, surfaceHolder$CallbackC0629y2, k5));
        arrayList.add(new M2.m(surfaceHolder$CallbackC0629y3, handler.getLooper()));
        arrayList.add(new C1464f(surfaceHolder$CallbackC0629y4, handler.getLooper()));
        arrayList.add(new C0366b());
        return (AbstractC0600d[]) arrayList.toArray(new AbstractC0600d[0]);
    }
}
