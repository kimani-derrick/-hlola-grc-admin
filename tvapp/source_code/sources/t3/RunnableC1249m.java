package t3;

import K.O;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import k.C0852F;
import k3.AbstractC0958a;
import l4.ExecutorC0976d;
import u4.s;
import w0.C1351e;
import w0.C1352f;
import w0.C1360n;
import w0.C1361o;
import w0.C1362p;
import w0.F;
import w0.RunnableC1349c;
import w4.l0;
/* renamed from: t3.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1249m implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14592q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f14593r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f14594s;

    public RunnableC1249m(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z7) {
        this.f14592q = 4;
        this.f14594s = swipeDismissBehavior;
        this.f14593r = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1352f c1352f;
        int i7;
        int i8;
        C1361o c1361o;
        int i9;
        int i10;
        int i11;
        Object obj = this.f14594s;
        Object obj2 = this.f14593r;
        switch (this.f14592q) {
            case 0:
                C1248l c1248l = (C1248l) obj;
                try {
                    C1251o A6 = ((InterfaceC1243g) c1248l.f14590s).A(((C1251o) obj2).g());
                    ExecutorC0976d executorC0976d = AbstractC1245i.f14575b;
                    A6.c(executorC0976d, c1248l);
                    A6.b(executorC0976d, c1248l);
                    A6.a(executorC0976d, c1248l);
                    return;
                } catch (CancellationException unused) {
                    c1248l.b();
                    return;
                } catch (C1242f e3) {
                    e = e3;
                    if (e.getCause() instanceof Exception) {
                        e = (Exception) e.getCause();
                    }
                    c1248l.c(e);
                    return;
                } catch (Exception e7) {
                    e = e7;
                    c1248l.c(e);
                    return;
                }
            case 1:
                C1251o c1251o = (C1251o) obj2;
                try {
                    c1251o.l(((Callable) obj).call());
                    return;
                } catch (Exception e8) {
                    c1251o.k(e8);
                    return;
                } catch (Throwable th) {
                    c1251o.k(new RuntimeException(th));
                    return;
                }
            case 2:
                s.a((s) obj, (B4.d) obj2);
                return;
            case 3:
                RunnableC1349c runnableC1349c = (RunnableC1349c) obj;
                C1351e c1351e = runnableC1349c.f15515u;
                if (c1351e.f15525g == runnableC1349c.f15513s) {
                    List list = runnableC1349c.f15512r;
                    c1351e.f15524e = list;
                    c1351e.f = Collections.unmodifiableList(list);
                    C1361o c1361o2 = (C1361o) obj2;
                    c1361o2.getClass();
                    F f = c1351e.f15521a;
                    if (f instanceof C1352f) {
                        c1352f = (C1352f) f;
                    } else {
                        c1352f = new C1352f(f);
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    List list2 = c1361o2.f15615a;
                    int size = list2.size() - 1;
                    int i12 = c1361o2.f15618e;
                    int i13 = c1361o2.f;
                    int i14 = i12;
                    while (size >= 0) {
                        C1360n c1360n = (C1360n) list2.get(size);
                        int i15 = c1360n.f15610a;
                        int i16 = c1360n.f15612c;
                        int i17 = i15 + i16;
                        int i18 = c1360n.f15611b;
                        int i19 = i18 + i16;
                        while (true) {
                            int[] iArr = c1361o2.f15616b;
                            List list3 = list2;
                            C0852F c0852f = c1361o2.d;
                            int i20 = i13;
                            int i21 = 0;
                            if (i14 > i17) {
                                i14--;
                                int i22 = iArr[i14];
                                if ((i22 & 12) != 0) {
                                    i10 = i17;
                                    int i23 = i22 >> 4;
                                    C1362p a7 = C1361o.a(arrayDeque, i23, false);
                                    if (a7 != null) {
                                        i11 = i18;
                                        int i24 = (i12 - a7.f15626b) - 1;
                                        c1352f.j(i14, i24);
                                        if ((i22 & 4) != 0) {
                                            c0852f.w(i14, i23);
                                            c1352f.m(i24, 1, null);
                                        }
                                    } else {
                                        i11 = i18;
                                        arrayDeque.add(new C1362p(i14, (i12 - i14) - 1, true));
                                    }
                                } else {
                                    i10 = i17;
                                    i11 = i18;
                                    c1352f.h(i14, 1);
                                    i12--;
                                }
                                list2 = list3;
                                i13 = i20;
                                i17 = i10;
                                i18 = i11;
                            } else {
                                int i25 = i18;
                                int i26 = i20;
                                while (i26 > i19) {
                                    i26--;
                                    int i27 = c1361o2.f15617c[i26];
                                    if ((i27 & 12) != 0) {
                                        int i28 = i27 >> 4;
                                        i8 = i19;
                                        c1361o = c1361o2;
                                        C1362p a8 = C1361o.a(arrayDeque, i28, true);
                                        if (a8 == null) {
                                            arrayDeque.add(new C1362p(i26, i12 - i14, false));
                                            i9 = 0;
                                        } else {
                                            i9 = 0;
                                            c1352f.j((i12 - a8.f15626b) - 1, i14);
                                            if ((i27 & 4) != 0) {
                                                c0852f.w(i28, i26);
                                                c1352f.m(i14, 1, null);
                                            }
                                        }
                                    } else {
                                        i8 = i19;
                                        c1361o = c1361o2;
                                        i9 = i21;
                                        c1352f.i(i14, 1);
                                        i12++;
                                    }
                                    i21 = i9;
                                    i19 = i8;
                                    c1361o2 = c1361o;
                                }
                                C1361o c1361o3 = c1361o2;
                                i14 = c1360n.f15610a;
                                int i29 = i14;
                                int i30 = i25;
                                while (i21 < i16) {
                                    if ((iArr[i29] & 15) == 2) {
                                        c0852f.w(i29, i30);
                                        i7 = 1;
                                        c1352f.m(i29, 1, null);
                                    } else {
                                        i7 = 1;
                                    }
                                    i29 += i7;
                                    i30 += i7;
                                    i21 += i7;
                                }
                                size--;
                                list2 = list3;
                                i13 = i25;
                                c1361o2 = c1361o3;
                            }
                        }
                    }
                    c1352f.a();
                    c1351e.a(runnableC1349c.f15514t);
                    return;
                }
                return;
            case 4:
                T.e eVar = ((SwipeDismissBehavior) obj).f8741a;
                if (eVar != null && eVar.f()) {
                    Field field = O.f1447a;
                    ((View) obj2).postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                l0.x((D5.d) obj2).m(AbstractC0958a.m((Exception) obj));
                return;
            default:
                ((View) obj2).setLayoutParams((ViewGroup.LayoutParams) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC1249m(Object obj, int i7, Object obj2) {
        this.f14592q = i7;
        this.f14594s = obj;
        this.f14593r = obj2;
    }

    public /* synthetic */ RunnableC1249m(Object obj, Object obj2, int i7, boolean z7) {
        this.f14592q = i7;
        this.f14593r = obj;
        this.f14594s = obj2;
    }
}
