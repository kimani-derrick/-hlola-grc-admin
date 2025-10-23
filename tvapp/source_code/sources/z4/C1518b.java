package z4;

import A4.e;
import A4.f;
import B4.d;
import H.j;
import H2.A;
import H2.U;
import O3.E;
import T1.h;
import T1.m;
import T1.u;
import Z2.H;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import e2.C0585B;
import e2.H0;
import e2.J0;
import e2.v0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k.AbstractC0857H0;
import k.AbstractC0869T;
import k.C0904o;
import k.C0915t0;
import k.V0;
import m3.g;
import r4.c;
import t2.i;
import t3.C1244h;
import t3.C1251o;
import u4.C1273A;
import u4.C1277a;
import u4.C1278b;
import u4.C1287k;
import u4.t;
import u4.z;
import v4.AbstractC1335m;
import v4.C1324b;
import v4.C1326d;
import v4.C1327e;
import v4.InterfaceC1325c;
import w4.A0;
import w4.B;
import w4.B0;
import w4.L;
import w4.M;
import w4.V;
import w4.W;
import w4.Y;
import w4.Z;
import w4.t0;
import w4.w0;
import w4.x0;
import x4.C1466a;
/* renamed from: z4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518b {

    /* renamed from: a  reason: collision with root package name */
    public Object f16461a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16462b;

    /* renamed from: c  reason: collision with root package name */
    public Object f16463c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f16464e;
    public Object f;

    public static L a(L l7, C1327e c1327e, V0 v02) {
        String str;
        C1518b a7 = l7.a();
        String c5 = ((InterfaceC1325c) c1327e.f15333b).c();
        if (c5 != null) {
            a7.f16464e = new W(c5);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List o7 = o(((C1326d) ((AtomicMarkableReference) ((L0.b) v02.d).f1863b).getReference()).a());
        List o8 = o(((C1326d) ((AtomicMarkableReference) ((L0.b) v02.f11963e).f1863b).getReference()).a());
        if (!o7.isEmpty() || !o8.isEmpty()) {
            M m7 = (M) l7.f15920c;
            t0 t0Var = m7.f15922a;
            if (t0Var == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                a7.f16463c = new M(t0Var, o7, o8, m7.d, m7.f15925e, m7.f, m7.f15926g);
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
        }
        return a7.g();
    }

    public static B0 c(L l7, V0 v02) {
        List n = ((j) v02.f).n();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < n.size(); i7++) {
            AbstractC1335m abstractC1335m = (AbstractC1335m) n.get(i7);
            abstractC1335m.getClass();
            C4.b bVar = new C4.b(24, false);
            C1324b c1324b = (C1324b) abstractC1335m;
            String str = c1324b.f15327e;
            if (str != null) {
                String str2 = c1324b.f15325b;
                if (str2 != null) {
                    bVar.f423t = new Y(str2, str);
                    String str3 = c1324b.f15326c;
                    if (str3 != null) {
                        bVar.f421r = str3;
                        String str4 = c1324b.d;
                        if (str4 != null) {
                            bVar.f422s = str4;
                            bVar.f424u = Long.valueOf(c1324b.f);
                            arrayList.add(bVar.i());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return l7;
        }
        C1518b a7 = l7.a();
        a7.f = new Z(arrayList);
        return a7.g();
    }

    public static boolean e(int[] iArr, int i7) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static void i(File file) {
        if (file.exists() && t(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [z4.b, java.lang.Object] */
    public static C1518b j(Context context, C1273A c1273a, C1518b c1518b, C1277a c1277a, C1327e c1327e, V0 v02, K1 k12, d dVar, i iVar, C1287k c1287k) {
        t tVar = new t(context, c1273a, c1277a, k12, dVar);
        C1517a c1517a = new C1517a(c1518b, dVar, c1287k);
        C1466a c1466a = A4.b.f93b;
        u.b(context);
        A4.b bVar = new A4.b(new f(u.a().c(new R1.a(A4.b.f94c, A4.b.d)).a("FIREBASE_CRASHLYTICS_REPORT", new Q1.b("json"), A4.b.f95e), dVar.d(), iVar));
        ?? obj = new Object();
        obj.f16461a = tVar;
        obj.f16462b = c1517a;
        obj.f16463c = bVar;
        obj.d = c1327e;
        obj.f16464e = v02;
        obj.f = c1273a;
        return obj;
    }

    public static ColorStateList k(Context context, int i7) {
        int c5 = AbstractC0857H0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC0857H0.f11904b, AbstractC0857H0.d, AbstractC0857H0.f11905c, AbstractC0857H0.f}, new int[]{AbstractC0857H0.b(context, R.attr.colorButtonNormal), D.a.b(c5, i7), D.a.b(c5, i7), i7});
    }

    public static A l(v0 v0Var, E e3, A a7, H0 h02) {
        Object m7;
        int i7;
        C0585B c0585b = (C0585B) v0Var;
        J0 O5 = c0585b.O();
        int L6 = c0585b.L();
        if (O5.q()) {
            m7 = null;
        } else {
            m7 = O5.m(L6);
        }
        if (!c0585b.W() && !O5.q()) {
            i7 = O5.f(L6, h02).b(H.J(c0585b.M()) - h02.g());
        } else {
            i7 = -1;
        }
        for (int i8 = 0; i8 < e3.size(); i8++) {
            A a8 = (A) e3.get(i8);
            if (q(a8, m7, c0585b.W(), c0585b.I(), c0585b.J(), i7)) {
                return a8;
            }
        }
        if (e3.isEmpty() && a7 != null) {
            if (q(a7, m7, c0585b.W(), c0585b.I(), c0585b.J(), i7)) {
                return a7;
            }
        }
        return null;
    }

    public static LayerDrawable m(C0915t0 c0915t0, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable f = c0915t0.f(context, R.drawable.abc_star_black_48dp);
        Drawable f7 = c0915t0.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f7 instanceof BitmapDrawable) && f7.getIntrinsicWidth() == dimensionPixelSize && f7.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f7;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f7.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new w4.E(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new H.b(17));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean q(A a7, Object obj, boolean z7, int i7, int i8, int i9) {
        if (!a7.f1180a.equals(obj)) {
            return false;
        }
        int i10 = a7.f1181b;
        if ((!z7 || i10 != i7 || a7.f1182c != i8) && (z7 || i10 != -1 || a7.f1183e != i9)) {
            return false;
        }
        return true;
    }

    public static synchronized void s(File file) {
        synchronized (C1518b.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean t(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                t(file2);
            }
        }
        return file.delete();
    }

    public static List u(Object[] objArr) {
        if (objArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(objArr);
    }

    public static void x(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter h7;
        int[] iArr = AbstractC0869T.f11941a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0904o.f12071b;
        }
        PorterDuff.Mode mode2 = C0904o.f12071b;
        synchronized (C0904o.class) {
            h7 = C0915t0.h(i7, mode);
        }
        mutate.setColorFilter(h7);
    }

    public void b(String str, String str2) {
        Map map = (Map) this.f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public void d(C.d dVar, A a7, J0 j02) {
        if (a7 == null) {
            return;
        }
        if (j02.b(a7.f1180a) != -1 || (j02 = (J0) ((O3.Z) this.f16463c).get(a7)) != null) {
            dVar.z(a7, j02);
        }
    }

    public h f() {
        String str;
        if (((String) this.f16461a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((m) this.f16463c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            str = AbstractC0515y1.m(str, " eventMillis");
        }
        if (((Long) this.f16464e) == null) {
            str = AbstractC0515y1.m(str, " uptimeMillis");
        }
        if (((Map) this.f) == null) {
            str = AbstractC0515y1.m(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new h((String) this.f16461a, (Integer) this.f16462b, (m) this.f16463c, ((Long) this.d).longValue(), ((Long) this.f16464e).longValue(), (Map) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public L g() {
        String str;
        if (((Long) this.f16461a) == null) {
            str = " timestamp";
        } else {
            str = "";
        }
        if (((String) this.f16462b) == null) {
            str = str.concat(" type");
        }
        if (((w4.v0) this.f16463c) == null) {
            str = AbstractC0515y1.m(str, " app");
        }
        if (((w0) this.d) == null) {
            str = AbstractC0515y1.m(str, " device");
        }
        if (str.isEmpty()) {
            return new L(((Long) this.f16461a).longValue(), (String) this.f16462b, (w4.v0) this.f16463c, (w0) this.d, (x0) this.f16464e, (A0) this.f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public V h() {
        String str;
        if (((Integer) this.f16462b) == null) {
            str = " batteryVelocity";
        } else {
            str = "";
        }
        if (((Boolean) this.f16463c) == null) {
            str = str.concat(" proximityOn");
        }
        if (((Integer) this.d) == null) {
            str = AbstractC0515y1.m(str, " orientation");
        }
        if (((Long) this.f16464e) == null) {
            str = AbstractC0515y1.m(str, " ramUsed");
        }
        if (((Long) this.f) == null) {
            str = AbstractC0515y1.m(str, " diskUsed");
        }
        if (str.isEmpty()) {
            return new V((Double) this.f16461a, ((Integer) this.f16462b).intValue(), ((Boolean) this.f16463c).booleanValue(), ((Integer) this.d).intValue(), ((Long) this.f16464e).longValue(), ((Long) this.f).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public File n(String str, String str2) {
        File file = new File((File) this.f16463c, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public ColorStateList p(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            return android.support.v4.media.session.b.h0(context, R.color.abc_tint_edittext);
        }
        if (i7 == R.drawable.abc_switch_track_mtrl_alpha) {
            return android.support.v4.media.session.b.h0(context, R.color.abc_tint_switch_track);
        }
        if (i7 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = AbstractC0857H0.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = AbstractC0857H0.f11904b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = AbstractC0857H0.f11906e;
                iArr2[1] = AbstractC0857H0.c(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC0857H0.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = AbstractC0857H0.f11904b;
                iArr2[0] = AbstractC0857H0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = AbstractC0857H0.f11906e;
                iArr2[1] = AbstractC0857H0.c(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC0857H0.f;
                iArr2[2] = AbstractC0857H0.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
            return k(context, AbstractC0857H0.c(context, R.attr.colorButtonNormal));
        } else {
            if (i7 == R.drawable.abc_btn_borderless_material) {
                return k(context, 0);
            }
            if (i7 == R.drawable.abc_btn_colored_material) {
                return k(context, AbstractC0857H0.c(context, R.attr.colorAccent));
            }
            if (i7 != R.drawable.abc_spinner_mtrl_am_alpha && i7 != R.drawable.abc_spinner_textfield_background_material) {
                if (e((int[]) this.f16462b, i7)) {
                    return AbstractC0857H0.d(context, R.attr.colorControlNormal);
                }
                if (e((int[]) this.f16464e, i7)) {
                    return android.support.v4.media.session.b.h0(context, R.color.abc_tint_default);
                }
                if (e((int[]) this.f, i7)) {
                    return android.support.v4.media.session.b.h0(context, R.color.abc_tint_btn_checkable);
                }
                if (i7 == R.drawable.abc_seekbar_thumb_material) {
                    return android.support.v4.media.session.b.h0(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return android.support.v4.media.session.b.h0(context, R.color.abc_tint_spinner);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
        r9 = android.app.Application.getProcessName();
     */
    /* JADX WARN: Type inference failed for: r14v0, types: [z4.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(java.lang.Throwable r24, java.lang.Thread r25, java.lang.String r26, java.lang.String r27, long r28, boolean r30) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C1518b.r(java.lang.Throwable, java.lang.Thread, java.lang.String, java.lang.String, long, boolean):void");
    }

    public C1251o v(String str, Executor executor) {
        C1244h c1244h;
        ArrayList b7 = ((C1517a) this.f16462b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b7.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C1466a c1466a = C1517a.f16455g;
                String e3 = C1517a.e(file);
                c1466a.getClass();
                arrayList.add(new C1278b(C1466a.i(e3), file.getName(), file));
            } catch (IOException e7) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1278b c1278b = (C1278b) it2.next();
            if (str == null || str.equals(c1278b.f14986b)) {
                A4.b bVar = (A4.b) this.f16463c;
                B b8 = (B) c1278b.f14985a;
                boolean z7 = true;
                if (b8.f == null || b8.f15873g == null) {
                    z b9 = ((C1273A) this.f).b(true);
                    J3.j a7 = c1278b.f14985a.a();
                    a7.f1376e = b9.f15071a;
                    J3.j a8 = a7.b().a();
                    a8.f = b9.f15072b;
                    c1278b = new C1278b(a8.b(), c1278b.f14986b, c1278b.f14987c);
                }
                if (str == null) {
                    z7 = false;
                }
                f fVar = bVar.f96a;
                synchronized (fVar.f) {
                    try {
                        c1244h = new C1244h();
                        if (z7) {
                            ((AtomicInteger) fVar.f114i.f14556r).getAndIncrement();
                            if (fVar.f.size() < fVar.f111e) {
                                c cVar = c.f13480a;
                                cVar.c("Enqueueing report: " + c1278b.f14986b);
                                cVar.c("Queue size: " + fVar.f.size());
                                fVar.f112g.execute(new e(fVar, c1278b, c1244h, 0));
                                cVar.c("Closing task for report: " + c1278b.f14986b);
                                c1244h.b(c1278b);
                            } else {
                                fVar.a();
                                String str2 = "Dropping report due to queue being full: " + c1278b.f14986b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) fVar.f114i.f14557s).getAndIncrement();
                                c1244h.b(c1278b);
                            }
                        } else {
                            fVar.b(c1278b, c1244h);
                        }
                    } finally {
                    }
                }
                arrayList2.add(c1244h.f14573a.d(executor, new U(27, this)));
            }
        }
        return g.G(arrayList2);
    }

    public void w(m mVar) {
        if (mVar != null) {
            this.f16463c = mVar;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (a.AbstractC0189a.r((H2.A) r3.d, (H2.A) r3.f) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        d(r0, (H2.A) r3.d, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (((O3.E) r3.f16462b).contains((H2.A) r3.d) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(e2.J0 r4) {
        /*
            r3 = this;
            C.d r0 = O3.Z.a()
            java.lang.Object r1 = r3.f16462b
            O3.E r1 = (O3.E) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r3.f16464e
            H2.A r1 = (H2.A) r1
            r3.d(r0, r1, r4)
            java.lang.Object r1 = r3.f
            H2.A r1 = (H2.A) r1
            java.lang.Object r2 = r3.f16464e
            H2.A r2 = (H2.A) r2
            boolean r1 = a.AbstractC0189a.r(r1, r2)
            if (r1 != 0) goto L2a
            java.lang.Object r1 = r3.f
            H2.A r1 = (H2.A) r1
            r3.d(r0, r1, r4)
        L2a:
            java.lang.Object r1 = r3.d
            H2.A r1 = (H2.A) r1
            java.lang.Object r2 = r3.f16464e
            H2.A r2 = (H2.A) r2
            boolean r1 = a.AbstractC0189a.r(r1, r2)
            if (r1 != 0) goto L78
            java.lang.Object r1 = r3.d
            H2.A r1 = (H2.A) r1
            java.lang.Object r2 = r3.f
            H2.A r2 = (H2.A) r2
            boolean r1 = a.AbstractC0189a.r(r1, r2)
            if (r1 != 0) goto L78
        L46:
            java.lang.Object r1 = r3.d
            H2.A r1 = (H2.A) r1
            r3.d(r0, r1, r4)
            goto L78
        L4e:
            r1 = 0
        L4f:
            java.lang.Object r2 = r3.f16462b
            O3.E r2 = (O3.E) r2
            int r2 = r2.size()
            if (r1 >= r2) goto L69
            java.lang.Object r2 = r3.f16462b
            O3.E r2 = (O3.E) r2
            java.lang.Object r2 = r2.get(r1)
            H2.A r2 = (H2.A) r2
            r3.d(r0, r2, r4)
            int r1 = r1 + 1
            goto L4f
        L69:
            java.lang.Object r1 = r3.f16462b
            O3.E r1 = (O3.E) r1
            java.lang.Object r2 = r3.d
            H2.A r2 = (H2.A) r2
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L78
            goto L46
        L78:
            O3.Z r4 = r0.c()
            r3.f16463c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C1518b.y(e2.J0):void");
    }
}
