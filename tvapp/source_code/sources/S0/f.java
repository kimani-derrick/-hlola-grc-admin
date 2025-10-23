package S0;

import A5.t;
import A5.w;
import W5.AbstractC0113u;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0342u;
import coil.target.GenericViewTarget;
import coil.target.ImageViewTarget;
import java.util.LinkedHashMap;
import java.util.List;
import z5.C1524f;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: A  reason: collision with root package name */
    public Drawable f2968A;

    /* renamed from: B  reason: collision with root package name */
    public Integer f2969B;

    /* renamed from: C  reason: collision with root package name */
    public Drawable f2970C;

    /* renamed from: D  reason: collision with root package name */
    public final Integer f2971D;

    /* renamed from: E  reason: collision with root package name */
    public final Drawable f2972E;
    public final P1.c F;

    /* renamed from: G  reason: collision with root package name */
    public final T0.g f2973G;

    /* renamed from: H  reason: collision with root package name */
    public P1.c f2974H;

    /* renamed from: I  reason: collision with root package name */
    public T0.g f2975I;

    /* renamed from: J  reason: collision with root package name */
    public final int f2976J;

    /* renamed from: K  reason: collision with root package name */
    public final int f2977K;

    /* renamed from: L  reason: collision with root package name */
    public final int f2978L;

    /* renamed from: M  reason: collision with root package name */
    public final int f2979M;

    /* renamed from: N  reason: collision with root package name */
    public final int f2980N;

    /* renamed from: O  reason: collision with root package name */
    public int f2981O;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2982a;

    /* renamed from: b  reason: collision with root package name */
    public a f2983b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2984c;
    public GenericViewTarget d;

    /* renamed from: e  reason: collision with root package name */
    public final J0.c f2985e;
    public final Q0.b f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2986g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap.Config f2987h;

    /* renamed from: i  reason: collision with root package name */
    public final ColorSpace f2988i;

    /* renamed from: j  reason: collision with root package name */
    public final C1524f f2989j;

    /* renamed from: k  reason: collision with root package name */
    public final K0.c f2990k;

    /* renamed from: l  reason: collision with root package name */
    public List f2991l;

    /* renamed from: m  reason: collision with root package name */
    public final W0.a f2992m;
    public final h6.q n;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashMap f2993o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f2994p;

    /* renamed from: q  reason: collision with root package name */
    public final Boolean f2995q;

    /* renamed from: r  reason: collision with root package name */
    public final Boolean f2996r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f2997s;

    /* renamed from: t  reason: collision with root package name */
    public final AbstractC0113u f2998t;

    /* renamed from: u  reason: collision with root package name */
    public final AbstractC0113u f2999u;

    /* renamed from: v  reason: collision with root package name */
    public final AbstractC0113u f3000v;

    /* renamed from: w  reason: collision with root package name */
    public final AbstractC0113u f3001w;

    /* renamed from: x  reason: collision with root package name */
    public final l f3002x;

    /* renamed from: y  reason: collision with root package name */
    public final Q0.b f3003y;

    /* renamed from: z  reason: collision with root package name */
    public Integer f3004z;

    public f(g gVar, Context context) {
        int i7;
        this.f2982a = context;
        this.f2983b = gVar.f3011H;
        this.f2984c = gVar.f3018b;
        this.d = gVar.f3019c;
        this.f2985e = gVar.d;
        this.f = gVar.f3020e;
        this.f2986g = gVar.f;
        b bVar = gVar.f3010G;
        this.f2987h = bVar.f2958j;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2988i = gVar.f3022h;
        }
        this.f2976J = bVar.f2957i;
        this.f2989j = gVar.f3023i;
        this.f2990k = gVar.f3024j;
        this.f2991l = gVar.f3025k;
        this.f2992m = bVar.f2956h;
        this.n = gVar.f3027m.g();
        this.f2993o = w.P(gVar.n.f3063a);
        this.f2994p = gVar.f3028o;
        this.f2995q = bVar.f2959k;
        this.f2996r = bVar.f2960l;
        this.f2997s = gVar.f3031r;
        this.f2977K = bVar.f2961m;
        this.f2978L = bVar.n;
        this.f2979M = bVar.f2962o;
        this.f2998t = bVar.d;
        this.f2999u = bVar.f2954e;
        this.f3000v = bVar.f;
        this.f3001w = bVar.f2955g;
        m mVar = gVar.f3038y;
        mVar.getClass();
        this.f3002x = new l(mVar);
        this.f3003y = gVar.f3039z;
        this.f3004z = gVar.f3005A;
        this.f2968A = gVar.f3006B;
        this.f2969B = gVar.f3007C;
        this.f2970C = gVar.f3008D;
        this.f2971D = gVar.f3009E;
        this.f2972E = gVar.F;
        this.F = bVar.f2951a;
        this.f2973G = bVar.f2952b;
        this.f2980N = bVar.f2953c;
        if (gVar.f3017a == context) {
            this.f2974H = gVar.f3036w;
            this.f2975I = gVar.f3037x;
            i7 = gVar.f3016M;
        } else {
            this.f2974H = null;
            this.f2975I = null;
            i7 = 0;
        }
        this.f2981O = i7;
    }

    public final g a() {
        h6.r rVar;
        p pVar;
        p pVar2;
        boolean z7;
        boolean z8;
        T0.g gVar;
        int i7;
        m mVar;
        T0.e eVar;
        KeyEvent.Callback callback;
        int i8;
        T0.g cVar;
        T0.g gVar2;
        ImageView.ScaleType scaleType;
        Context context;
        Object obj = this.f2984c;
        if (obj == null) {
            obj = i.f3040b;
        }
        Object obj2 = obj;
        GenericViewTarget genericViewTarget = this.d;
        Bitmap.Config config = this.f2987h;
        if (config == null) {
            config = this.f2983b.f2943g;
        }
        Bitmap.Config config2 = config;
        ColorSpace colorSpace = this.f2988i;
        int i9 = this.f2976J;
        if (i9 == 0) {
            i9 = this.f2983b.f;
        }
        int i10 = i9;
        List list = this.f2991l;
        W0.a aVar = this.f2992m;
        if (aVar == null) {
            aVar = this.f2983b.f2942e;
        }
        W0.a aVar2 = aVar;
        h6.q qVar = this.n;
        m mVar2 = null;
        if (qVar != null) {
            rVar = qVar.c();
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = X0.e.f4061c;
        } else {
            Bitmap.Config[] configArr = X0.e.f4059a;
        }
        h6.r rVar2 = rVar;
        LinkedHashMap linkedHashMap = this.f2993o;
        if (linkedHashMap != null) {
            pVar = new p(p6.l.S(linkedHashMap));
        } else {
            pVar = null;
        }
        if (pVar == null) {
            pVar2 = p.f3062b;
        } else {
            pVar2 = pVar;
        }
        Boolean bool = this.f2995q;
        if (bool != null) {
            z7 = bool.booleanValue();
        } else {
            z7 = this.f2983b.f2944h;
        }
        boolean z9 = z7;
        Boolean bool2 = this.f2996r;
        if (bool2 != null) {
            z8 = bool2.booleanValue();
        } else {
            z8 = this.f2983b.f2945i;
        }
        boolean z10 = z8;
        int i11 = this.f2977K;
        if (i11 == 0) {
            i11 = this.f2983b.f2949m;
        }
        int i12 = i11;
        int i13 = this.f2978L;
        if (i13 == 0) {
            i13 = this.f2983b.n;
        }
        int i14 = i13;
        int i15 = this.f2979M;
        if (i15 == 0) {
            i15 = this.f2983b.f2950o;
        }
        int i16 = i15;
        AbstractC0113u abstractC0113u = this.f2998t;
        if (abstractC0113u == null) {
            abstractC0113u = this.f2983b.f2939a;
        }
        AbstractC0113u abstractC0113u2 = abstractC0113u;
        AbstractC0113u abstractC0113u3 = this.f2999u;
        if (abstractC0113u3 == null) {
            abstractC0113u3 = this.f2983b.f2940b;
        }
        AbstractC0113u abstractC0113u4 = abstractC0113u3;
        AbstractC0113u abstractC0113u5 = this.f3000v;
        if (abstractC0113u5 == null) {
            abstractC0113u5 = this.f2983b.f2941c;
        }
        AbstractC0113u abstractC0113u6 = abstractC0113u5;
        AbstractC0113u abstractC0113u7 = this.f3001w;
        if (abstractC0113u7 == null) {
            abstractC0113u7 = this.f2983b.d;
        }
        AbstractC0113u abstractC0113u8 = abstractC0113u7;
        P1.c cVar2 = this.F;
        Context context2 = this.f2982a;
        if (cVar2 == null && (cVar2 = this.f2974H) == null) {
            GenericViewTarget genericViewTarget2 = this.d;
            if (genericViewTarget2 instanceof GenericViewTarget) {
                context = genericViewTarget2.k().getContext();
            } else {
                context = context2;
            }
            while (true) {
                if (context instanceof InterfaceC0342u) {
                    cVar2 = ((InterfaceC0342u) context).q();
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    cVar2 = null;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (cVar2 == null) {
                cVar2 = e.f2966r;
            }
        }
        P1.c cVar3 = cVar2;
        T0.g gVar3 = this.f2973G;
        int i17 = 1;
        if (gVar3 == null) {
            T0.g gVar4 = this.f2975I;
            if (gVar4 == null) {
                GenericViewTarget genericViewTarget3 = this.d;
                if (genericViewTarget3 instanceof GenericViewTarget) {
                    ImageView k5 = genericViewTarget3.k();
                    if ((k5 instanceof ImageView) && ((scaleType = k5.getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                        T0.f fVar = T0.f.f3206c;
                        gVar2 = new T0.d();
                        gVar = gVar2;
                    } else {
                        cVar = new T0.e(k5, true);
                    }
                } else {
                    cVar = new T0.c(context2);
                }
                gVar2 = cVar;
                gVar = gVar2;
            } else {
                gVar = gVar4;
            }
        } else {
            gVar = gVar3;
        }
        int i18 = this.f2980N;
        if (i18 == 0 && (i18 = this.f2981O) == 0) {
            if (gVar3 instanceof T0.e) {
                eVar = (T0.e) gVar3;
            } else {
                eVar = null;
            }
            if (eVar == null || (callback = eVar.f3204a) == null) {
                GenericViewTarget genericViewTarget4 = this.d;
                if (!(genericViewTarget4 instanceof GenericViewTarget)) {
                    genericViewTarget4 = null;
                }
                if (genericViewTarget4 != null) {
                    callback = genericViewTarget4.k();
                } else {
                    callback = null;
                }
            }
            int i19 = 2;
            if (callback instanceof ImageView) {
                Bitmap.Config[] configArr2 = X0.e.f4059a;
                ImageView.ScaleType scaleType2 = ((ImageView) callback).getScaleType();
                if (scaleType2 == null) {
                    i8 = -1;
                } else {
                    i8 = X0.d.f4058a[scaleType2.ordinal()];
                }
                if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4) {
                    i17 = 2;
                }
                i19 = i17;
            }
            i7 = i19;
        } else {
            i7 = i18;
        }
        l lVar = this.f3002x;
        if (lVar != null) {
            mVar2 = new m(p6.l.S(lVar.f3054a));
        }
        if (mVar2 == null) {
            mVar = m.f3055r;
        } else {
            mVar = mVar2;
        }
        return new g(this.f2982a, obj2, genericViewTarget, this.f2985e, this.f, this.f2986g, config2, colorSpace, i10, this.f2989j, this.f2990k, list, aVar2, rVar2, pVar2, this.f2994p, z9, z10, this.f2997s, i12, i14, i16, abstractC0113u2, abstractC0113u4, abstractC0113u6, abstractC0113u8, cVar3, gVar, i7, mVar, this.f3003y, this.f3004z, this.f2968A, this.f2969B, this.f2970C, this.f2971D, this.f2972E, new b(this.F, this.f2973G, this.f2980N, this.f2998t, this.f2999u, this.f3000v, this.f3001w, this.f2992m, this.f2976J, this.f2987h, this.f2995q, this.f2996r, this.f2977K, this.f2978L, this.f2979M), this.f2983b);
    }

    public final void b(ImageView imageView) {
        this.d = new ImageViewTarget(imageView);
        this.f2974H = null;
        this.f2975I = null;
        this.f2981O = 0;
    }

    public f(Context context) {
        this.f2982a = context;
        this.f2983b = X0.c.f4057a;
        this.f2984c = null;
        this.d = null;
        this.f2985e = null;
        this.f = null;
        this.f2986g = null;
        this.f2987h = null;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2988i = null;
        }
        this.f2976J = 0;
        this.f2989j = null;
        this.f2990k = null;
        this.f2991l = t.f135q;
        this.f2992m = null;
        this.n = null;
        this.f2993o = null;
        this.f2994p = true;
        this.f2995q = null;
        this.f2996r = null;
        this.f2997s = true;
        this.f2977K = 0;
        this.f2978L = 0;
        this.f2979M = 0;
        this.f2998t = null;
        this.f2999u = null;
        this.f3000v = null;
        this.f3001w = null;
        this.f3002x = null;
        this.f3003y = null;
        this.f3004z = null;
        this.f2968A = null;
        this.f2969B = null;
        this.f2970C = null;
        this.f2971D = null;
        this.f2972E = null;
        this.F = null;
        this.f2973G = null;
        this.f2980N = 0;
        this.f2974H = null;
        this.f2975I = null;
        this.f2981O = 0;
    }
}
