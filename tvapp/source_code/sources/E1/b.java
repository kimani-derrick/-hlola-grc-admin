package E1;

import H2.U;
import X2.w;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.b0;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.F;
import com.boxhdo.android.tv.customviews.CustomNavigationView;
import com.boxhdo.android.tv.ui.episode_list.TvEpisodeListFragment;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailFragment;
import com.boxhdo.android.tv.ui.tvseries.TvSeriesFragment;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import e2.SurfaceHolder$CallbackC0629y;
import e5.C0658c;
import f2.C0695a;
import j1.AbstractC0817o;
import j1.AbstractC0823u;
import j2.C0834c;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import k3.AbstractC0958a;
import w2.C1384f;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f541q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f542r;

    public /* synthetic */ b(int i7, Object obj) {
        this.f541q = i7;
        this.f542r = obj;
    }

    private final void a() {
        androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) this.f542r;
        synchronized (oVar.d) {
            try {
                if (oVar.f5862h != null) {
                    try {
                        H.k d = oVar.d();
                        int i7 = d.f798e;
                        if (i7 == 2) {
                            synchronized (oVar.d) {
                            }
                        }
                        if (i7 == 0) {
                            int i8 = G.e.f741a;
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            J3.e eVar = oVar.f5859c;
                            Context context = oVar.f5857a;
                            eVar.getClass();
                            Typeface l7 = D.h.f435a.l(context, new H.k[]{d}, 0);
                            MappedByteBuffer z7 = AbstractC0958a.z(oVar.f5857a, d.f795a);
                            if (z7 != null && l7 != null) {
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C4.b bVar = new C4.b(l7, m3.g.D(z7));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (oVar.d) {
                                        AbstractC0958a abstractC0958a = oVar.f5862h;
                                        if (abstractC0958a != null) {
                                            abstractC0958a.B(bVar);
                                        }
                                    }
                                    oVar.b();
                                    return;
                                } catch (Throwable th) {
                                    int i9 = G.e.f741a;
                                    Trace.endSection();
                                    throw th;
                                }
                            }
                            throw new RuntimeException("Unable to open file.");
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    } catch (Throwable th2) {
                        synchronized (oVar.d) {
                            try {
                                AbstractC0958a abstractC0958a2 = oVar.f5862h;
                                if (abstractC0958a2 != null) {
                                    abstractC0958a2.A(th2);
                                }
                                oVar.b();
                            } finally {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f541q) {
            case 0:
                int i7 = TvSeriesFragment.f7912M1;
                TvSeriesFragment tvSeriesFragment = (TvSeriesFragment) this.f542r;
                M5.g.f(tvSeriesFragment, "this$0");
                View view = tvSeriesFragment.f7915L1;
                if (view != null) {
                    view.requestFocus();
                }
                tvSeriesFragment.f7915L1 = null;
                return;
            case 1:
                ((T4.c) this.f542r).S();
                return;
            case 2:
                ((N4.d) this.f542r).b(false);
                return;
            case 3:
                int i8 = DefaultTimeBar.f8132i0;
                ((DefaultTimeBar) this.f542r).d(false);
                return;
            case 4:
                ((w) this.f542r).o();
                return;
            case 5:
                Z1.l lVar = (Z1.l) this.f542r;
                lVar.getClass();
                ((a2.j) lVar.d).n(new U(7, lVar));
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((androidx.activity.l) this.f542r).invalidateOptionsMenu();
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                androidx.activity.k kVar = (androidx.activity.k) this.f542r;
                Runnable runnable = kVar.f5320r;
                if (runnable != null) {
                    runnable.run();
                    kVar.f5320r = null;
                    return;
                }
                return;
            case 8:
                androidx.activity.m.a((androidx.activity.m) this.f542r);
                return;
            case 9:
                a();
                return;
            case 10:
                ComponentCallbacksC0269x componentCallbacksC0269x = (ComponentCallbacksC0269x) this.f542r;
                b0 b0Var = componentCallbacksC0269x.f6127f0;
                b0Var.f6023v.g(componentCallbacksC0269x.f6137t);
                componentCallbacksC0269x.f6137t = null;
                return;
            case 11:
                F f = (F) this.f542r;
                M5.g.f(f, "this$0");
                int i9 = f.f6735r;
                C0344w c0344w = f.f6739v;
                if (i9 == 0) {
                    f.f6736s = true;
                    c0344w.G(EnumC0336n.ON_PAUSE);
                }
                if (f.f6734q == 0 && f.f6736s) {
                    c0344w.G(EnumC0336n.ON_STOP);
                    f.f6737t = true;
                    return;
                }
                return;
            case 12:
                b3.k kVar2 = (b3.k) this.f542r;
                Surface surface = kVar2.f7118x;
                if (surface != null) {
                    Iterator it = kVar2.f7111q.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolder$CallbackC0629y) it.next()).f10095q.k0(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar2.f7117w;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar2.f7117w = null;
                kVar2.f7118x = null;
                return;
            case 13:
                int i10 = DpadRecyclerView.l1;
                DpadRecyclerView dpadRecyclerView = (DpadRecyclerView) this.f542r;
                M5.g.f(dpadRecyclerView, "this$0");
                dpadRecyclerView.requestLayout();
                return;
            case 14:
                C0658c c0658c = (C0658c) this.f542r;
                M5.g.f(c0658c, "this$0");
                ((w0.U) c0658c.f10171g).H0();
                return;
            case 15:
                f2.f fVar = (f2.f) this.f542r;
                C0695a M6 = fVar.M();
                fVar.R(M6, 1028, new f2.d(M6));
                fVar.f10353v.d();
                return;
            case 16:
                CustomNavigationView.a((CustomNavigationView) this.f542r);
                return;
            case 17:
                j2.f fVar2 = (j2.f) this.f542r;
                if (!fVar2.f11793s) {
                    j2.k kVar3 = fVar2.f11792r;
                    if (kVar3 != null) {
                        kVar3.a(fVar2.f11791q);
                    }
                    fVar2.f11794t.f11797C.remove(fVar2);
                    fVar2.f11793s = true;
                    return;
                }
                return;
            case 18:
                ((C0834c) this.f542r).a(null);
                return;
            case 19:
                ((AbstractC0817o) ((TvEpisodeListFragment) this.f542r).f0()).f11698s.requestFocus();
                return;
            case 20:
                ((AbstractC0823u) ((TvMovieDetailFragment) this.f542r).f0()).f11726w.j0(0);
                return;
            default:
                C1384f c1384f = (C1384f) this.f542r;
                synchronized (c1384f.f15759a) {
                    try {
                        if (!c1384f.f15768l) {
                            long j7 = c1384f.f15767k - 1;
                            c1384f.f15767k = j7;
                            int i11 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
                            if (i11 <= 0) {
                                if (i11 < 0) {
                                    c1384f.b(new IllegalStateException());
                                } else {
                                    c1384f.a();
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
