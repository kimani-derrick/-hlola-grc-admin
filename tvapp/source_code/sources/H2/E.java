package H2;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.C0252f;
import com.boxhdo.domain.model.Movie;
import com.google.android.gms.internal.measurement.K1;
import e2.C0585B;
import e2.C0603e0;
import e2.H0;
import e2.SurfaceHolder$CallbackC0629y;
import e2.v0;
import f2.C0695a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import k3.AbstractC0958a;
import l4.C0975c;
import l4.InterfaceC0974b;
import org.json.JSONObject;
import q1.AbstractC1099a;
import t3.C1244h;
import t3.C1251o;
import u4.C1275C;
import x6.C1481n;
import x6.InterfaceC1473f;
import z4.C1518b;
/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f889q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f890r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f891s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f892t;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3, int i7) {
        this.f889q = i7;
        this.f890r = obj;
        this.f891s = obj2;
        this.f892t = obj3;
    }

    private final void a() {
        T1.j jVar = (T1.j) this.f890r;
        AbstractC0958a abstractC0958a = (AbstractC0958a) this.f891s;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f892t;
        jVar.getClass();
        try {
            androidx.emoji2.text.p j7 = h4.b.j(jVar.f3243a);
            if (j7 != null) {
                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) ((androidx.emoji2.text.i) j7.f5838b);
                synchronized (oVar.d) {
                    oVar.f = threadPoolExecutor;
                }
                ((androidx.emoji2.text.i) j7.f5838b).a(new androidx.emoji2.text.k(abstractC0958a, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            abstractC0958a.A(th);
            threadPoolExecutor.shutdown();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject optJSONObject;
        switch (this.f889q) {
            case 0:
                C.d dVar = (C.d) this.f890r;
                ((H) this.f891s).k(dVar.f324r, (A) dVar.f325s, (C0020v) this.f892t);
                return;
            case 1:
                String str = (String) this.f891s;
                V4.g gVar = (V4.g) this.f892t;
                K1 k12 = ((U4.m) this.f890r).f3462a;
                InterfaceC0974b interfaceC0974b = (InterfaceC0974b) ((M4.b) k12.f8367r).get();
                if (interfaceC0974b != null) {
                    JSONObject jSONObject = gVar.f3681e;
                    if (jSONObject.length() >= 1) {
                        JSONObject jSONObject2 = gVar.f3679b;
                        if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                            String optString = optJSONObject.optString("choiceId");
                            if (!optString.isEmpty()) {
                                synchronized (((Map) k12.f8368s)) {
                                    try {
                                        if (!optString.equals(((Map) k12.f8368s).get(str))) {
                                            ((Map) k12.f8368s).put(str, optString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str);
                                            bundle.putString("arm_value", jSONObject2.optString(str));
                                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", optJSONObject.optString("group"));
                                            C0975c c0975c = (C0975c) interfaceC0974b;
                                            c0975c.a("fp", "personalization_assignment", bundle);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", optString);
                                            c0975c.a("fp", "_fpc", bundle2);
                                        }
                                    } finally {
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a3.y yVar = (a3.y) this.f890r;
                yVar.getClass();
                int i7 = Z2.H.f4603a;
                SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = yVar.f5136c;
                surfaceHolder$CallbackC0629y.getClass();
                C0585B c0585b = surfaceHolder$CallbackC0629y.f10095q;
                c0585b.getClass();
                f2.f fVar = c0585b.f9426H;
                C0695a Q4 = fVar.Q();
                fVar.R(Q4, 1017, new f2.b(Q4, (e2.K) this.f891s, (i2.i) this.f892t));
                return;
            case 3:
                a();
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.f890r;
                M5.g.f(viewGroup, "$container");
                C0252f c0252f = (C0252f) this.f892t;
                M5.g.f(c0252f, "this$0");
                viewGroup.endViewTransition((View) this.f891s);
                ((androidx.fragment.app.e0) c0252f.f6046c.f2765q).c(c0252f);
                return;
            case 5:
                C0603e0 c0603e0 = (C0603e0) this.f890r;
                c0603e0.getClass();
                O3.U h7 = ((O3.B) this.f891s).h();
                f2.f fVar2 = c0603e0.f9950c;
                v0 v0Var = fVar2.f10354w;
                v0Var.getClass();
                C1518b c1518b = fVar2.f10351t;
                c1518b.getClass();
                c1518b.f16462b = O3.E.s(h7);
                if (!h7.isEmpty()) {
                    c1518b.f16464e = (A) h7.get(0);
                    A a7 = (A) this.f892t;
                    a7.getClass();
                    c1518b.f = a7;
                }
                if (((A) c1518b.d) == null) {
                    c1518b.d = C1518b.l(v0Var, (O3.E) c1518b.f16462b, (A) c1518b.f16464e, (H0) c1518b.f16461a);
                }
                c1518b.y(((C0585B) v0Var).O());
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                Pair pair = (Pair) this.f891s;
                ((f2.f) ((J3.m) ((androidx.fragment.app.D) this.f890r).f5884s).f1400i).r(((Integer) pair.first).intValue(), (A) pair.second, (Exception) this.f892t);
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                a3.y yVar2 = (a3.y) this.f890r;
                yVar2.getClass();
                int i8 = Z2.H.f4603a;
                SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y2 = yVar2.f5136c;
                surfaceHolder$CallbackC0629y2.getClass();
                C0585B c0585b2 = surfaceHolder$CallbackC0629y2.f10095q;
                c0585b2.getClass();
                f2.f fVar3 = c0585b2.f9426H;
                C0695a Q6 = fVar3.Q();
                fVar3.R(Q6, 1009, new f2.d(Q6, (e2.K) this.f891s, (i2.i) this.f892t));
                return;
            case 8:
                j2.n nVar = (j2.n) this.f890r;
                ((j2.o) this.f891s).r(nVar.f11833a, nVar.f11834b, (Exception) this.f892t);
                return;
            case 9:
                int i9 = AbstractC1099a.f13221C1;
                AbstractC1099a abstractC1099a = (AbstractC1099a) this.f890r;
                M5.g.f(abstractC1099a, "this$0");
                Movie movie = (Movie) this.f891s;
                M5.g.f(movie, "$movie");
                View view = (View) this.f892t;
                M5.g.f(view, "$it");
                abstractC1099a.N0(movie);
                view.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
                return;
            case 10:
                Callable callable = (Callable) this.f890r;
                Executor executor = (Executor) this.f891s;
                C1244h c1244h = (C1244h) this.f892t;
                try {
                    ((C1251o) callable.call()).d(executor, new C1275C(c1244h, 2));
                    return;
                } catch (Exception e3) {
                    c1244h.f14573a.k(e3);
                    return;
                }
            case 11:
                C1481n c1481n = (C1481n) ((t2.i) this.f890r).f14557s;
                boolean j7 = c1481n.f16314r.j();
                InterfaceC1473f interfaceC1473f = (InterfaceC1473f) this.f891s;
                if (j7) {
                    interfaceC1473f.f(c1481n, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC1473f.e(c1481n, (x6.N) this.f892t);
                    return;
                }
            default:
                ((InterfaceC1473f) this.f891s).f((C1481n) ((t2.i) this.f890r).f14557s, (Throwable) this.f892t);
                return;
        }
    }
}
