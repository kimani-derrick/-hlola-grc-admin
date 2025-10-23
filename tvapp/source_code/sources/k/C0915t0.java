package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.boxhdo.android.tv.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.C1054g;
import p.AbstractC1078a;
import z4.C1518b;
/* renamed from: k.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915t0 {

    /* renamed from: i  reason: collision with root package name */
    public static C0915t0 f12096i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f12098a;

    /* renamed from: b  reason: collision with root package name */
    public o.j f12099b;

    /* renamed from: c  reason: collision with root package name */
    public o.k f12100c;
    public final WeakHashMap d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f12101e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public C1518b f12102g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f12095h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final C0911r0 f12097j = new o.i(6);

    public static synchronized C0915t0 d() {
        C0915t0 c0915t0;
        synchronized (C0915t0.class) {
            try {
                if (f12096i == null) {
                    C0915t0 c0915t02 = new C0915t0();
                    f12096i = c0915t02;
                    j(c0915t02);
                }
                c0915t0 = f12096i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0915t0;
    }

    public static synchronized PorterDuffColorFilter h(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0915t0.class) {
            C0911r0 c0911r0 = f12097j;
            c0911r0.getClass();
            int i8 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0911r0.h(Integer.valueOf(mode.hashCode() + i8));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c0911r0.m(Integer.valueOf(mode.hashCode() + i8), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(C0915t0 c0915t0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0915t0.a("vector", new C0913s0(3));
            c0915t0.a("animated-vector", new C0913s0(2));
            c0915t0.a("animated-selector", new C0913s0(1));
            c0915t0.a("drawable", new C0913s0(0));
        }
    }

    public final void a(String str, C0913s0 c0913s0) {
        if (this.f12099b == null) {
            this.f12099b = new o.j(0);
        }
        this.f12099b.put(str, c0913s0);
    }

    public final synchronized void b(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1054g c1054g = (C1054g) this.d.get(context);
                if (c1054g == null) {
                    c1054g = new C1054g();
                    this.d.put(context, c1054g);
                }
                c1054g.k(j7, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i7) {
        int i8;
        if (this.f12101e == null) {
            this.f12101e = new TypedValue();
        }
        TypedValue typedValue = this.f12101e;
        context.getResources().getValue(i7, typedValue, true);
        long j7 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e3 = e(context, j7);
        if (e3 != null) {
            return e3;
        }
        LayerDrawable layerDrawable = null;
        if (this.f12102g != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i7 == R.drawable.abc_ratingbar_material) {
                    i8 = R.dimen.abc_star_big;
                } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                    i8 = R.dimen.abc_star_medium;
                } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                    i8 = R.dimen.abc_star_small;
                }
                layerDrawable = C1518b.m(this, context, i8);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j7, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j7) {
        C1054g c1054g = (C1054g) this.d.get(context);
        if (c1054g == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1054g.e(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b7 = AbstractC1078a.b(c1054g.f12797r, c1054g.f12799t, j7);
            if (b7 >= 0) {
                Object[] objArr = c1054g.f12798s;
                Object obj = objArr[b7];
                Object obj2 = o.h.f12800a;
                if (obj != obj2) {
                    objArr[b7] = obj2;
                    c1054g.f12796q = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i7) {
        return g(context, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11.f12099b.get(r0) != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010f, code lost:
        E.a.i(r7, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:3:0x0001, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:54:0x00e2, B:58:0x00ec, B:60:0x00f2, B:62:0x00f8, B:69:0x010f, B:67:0x010b, B:70:0x0114, B:74:0x012b, B:81:0x0161, B:82:0x0188, B:84:0x018d, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c1, B:48:0x00ca, B:49:0x00d1, B:50:0x00d2, B:52:0x00db, B:24:0x0051, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:87:0x0192, B:88:0x019b), top: B:92:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:3:0x0001, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:54:0x00e2, B:58:0x00ec, B:60:0x00f2, B:62:0x00f8, B:69:0x010f, B:67:0x010b, B:70:0x0114, B:74:0x012b, B:81:0x0161, B:82:0x0188, B:84:0x018d, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c1, B:48:0x00ca, B:49:0x00d1, B:50:0x00d2, B:52:0x00db, B:24:0x0051, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:87:0x0192, B:88:0x019b), top: B:92:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2 A[Catch: all -> 0x00e7, TryCatch #1 {all -> 0x00e7, blocks: (B:3:0x0001, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:54:0x00e2, B:58:0x00ec, B:60:0x00f2, B:62:0x00f8, B:69:0x010f, B:67:0x010b, B:70:0x0114, B:74:0x012b, B:81:0x0161, B:82:0x0188, B:84:0x018d, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c1, B:48:0x00ca, B:49:0x00d1, B:50:0x00d2, B:52:0x00db, B:24:0x0051, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:87:0x0192, B:88:0x019b), top: B:92:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #1 {all -> 0x00e7, blocks: (B:3:0x0001, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:54:0x00e2, B:58:0x00ec, B:60:0x00f2, B:62:0x00f8, B:69:0x010f, B:67:0x010b, B:70:0x0114, B:74:0x012b, B:81:0x0161, B:82:0x0188, B:84:0x018d, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c1, B:48:0x00ca, B:49:0x00d1, B:50:0x00d2, B:52:0x00db, B:24:0x0051, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:87:0x0192, B:88:0x019b), top: B:92:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable g(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0915t0.g(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized ColorStateList i(Context context, int i7) {
        ColorStateList colorStateList;
        o.k kVar;
        WeakHashMap weakHashMap = this.f12098a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (kVar = (o.k) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) kVar.e(i7);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            C1518b c1518b = this.f12102g;
            if (c1518b != null) {
                colorStateList2 = c1518b.p(context, i7);
            }
            if (colorStateList2 != null) {
                if (this.f12098a == null) {
                    this.f12098a = new WeakHashMap();
                }
                o.k kVar2 = (o.k) this.f12098a.get(context);
                if (kVar2 == null) {
                    kVar2 = new o.k();
                    this.f12098a.put(context, kVar2);
                }
                kVar2.b(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void k(C1518b c1518b) {
        this.f12102g = c1518b;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            z4.b r0 = r7.f12102g
            r1 = 0
            if (r0 == 0) goto L76
            android.graphics.PorterDuff$Mode r2 = k.C0904o.f12071b
            java.lang.Object r3 = r0.f16461a
            int[] r3 = (int[]) r3
            boolean r3 = z4.C1518b.e(r3, r9)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L19
            r9 = 2130968799(0x7f0400df, float:1.7546262E38)
        L16:
            r3 = r4
        L17:
            r0 = r5
            goto L55
        L19:
            java.lang.Object r3 = r0.f16463c
            int[] r3 = (int[]) r3
            boolean r3 = z4.C1518b.e(r3, r9)
            if (r3 == 0) goto L27
            r9 = 2130968797(0x7f0400dd, float:1.7546258E38)
            goto L16
        L27:
            java.lang.Object r0 = r0.d
            int[] r0 = (int[]) r0
            boolean r0 = z4.C1518b.e(r0, r9)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L38
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L36:
            r9 = r3
            goto L16
        L38:
            r0 = 2131230765(0x7f08002d, float:1.8077592E38)
            if (r9 != r0) goto L4c
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r4
            r6 = r0
            r0 = r9
            r9 = r6
            goto L55
        L4c:
            r0 = 2131230747(0x7f08001b, float:1.8077556E38)
            if (r9 != r0) goto L52
            goto L36
        L52:
            r9 = r1
            r3 = r9
            goto L17
        L55:
            if (r3 == 0) goto L76
            int[] r1 = k.AbstractC0869T.f11941a
            android.graphics.drawable.Drawable r10 = r10.mutate()
            int r8 = k.AbstractC0857H0.c(r8, r9)
            java.lang.Class<k.o> r9 = k.C0904o.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = h(r8, r2)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r5) goto L71
            r10.setAlpha(r0)
        L71:
            r1 = r4
            goto L76
        L73:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0915t0.l(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
