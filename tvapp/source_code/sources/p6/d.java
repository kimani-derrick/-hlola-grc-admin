package p6;

import K.D;
import K.O;
import W5.C0100g;
import Y2.InterfaceC0144m;
import Z4.C0179p;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import h6.r;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import k.S0;
import k.U0;
import o4.C1069a;
import o4.o;
import t3.C1248l;
import t3.C1251o;
import v6.C1338c;
import w4.l0;
/* loaded from: classes.dex */
public abstract class d {
    public static D5.i A(D5.g gVar, D5.i iVar) {
        M5.g.f(iVar, "context");
        if (iVar != D5.j.f531q) {
            return (D5.i) iVar.O(gVar, D5.b.f525t);
        }
        return gVar;
    }

    public static int B(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final void C(View view, View view2) {
        ViewGroup viewGroup;
        if ((view instanceof ViewGroup) && view2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            if (viewGroup2.indexOfChild(view2) == -1) {
                if (view2.getParent() != null) {
                    ViewParent parent = view2.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                }
                viewGroup2.addView(view2);
            }
        }
    }

    public static final void D(View view, View view2) {
        ViewGroup viewGroup;
        if ((view instanceof ViewGroup) && view2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            if (viewGroup2.indexOfChild(view2) == -1) {
                if (view2.getParent() != null) {
                    ViewParent parent = view2.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                }
                viewGroup2.addView(view2, 0);
            }
        }
    }

    public static final void E(View view, View view2) {
        if ((view instanceof ViewGroup) && view2 != null) {
            ((ViewGroup) view).removeView(view2);
        }
    }

    public static void F(View view, J3.g gVar) {
        E3.a aVar = gVar.f1362q.f1333b;
        if (aVar != null && aVar.f609a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                Field field = O.f1447a;
                f += D.i((View) parent);
            }
            J3.f fVar = gVar.f1362q;
            if (fVar.f1342m != f) {
                fVar.f1342m = f;
                gVar.m();
            }
        }
    }

    public static void G(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            S0.a(view, charSequence);
            return;
        }
        U0 u02 = U0.f11945A;
        if (u02 != null && u02.f11947q == view) {
            U0.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            U0 u03 = U0.f11946B;
            if (u03 != null && u03.f11947q == view) {
                u03.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new U0(view, charSequence);
    }

    public static final void H(EditText editText) {
        InputMethodManager inputMethodManager;
        editText.requestFocus();
        Object systemService = editText.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    public static int I(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object a(C1251o c1251o, C0179p c0179p) {
        if (c1251o.h()) {
            Exception f = c1251o.f();
            if (f == null) {
                if (!c1251o.d) {
                    return c1251o.g();
                }
                throw new CancellationException("Task " + c1251o + " was cancelled normally.");
            }
            throw f;
        }
        C0100g c0100g = new C0100g(1, l0.x(c0179p));
        c0100g.w();
        c1251o.f14596b.m(new C1248l(f6.a.f10441q, new f6.b(c0100g, 0)));
        c1251o.o();
        return c0100g.v();
    }

    public static C1338c b() {
        C1338c c1338c = C1338c.f15382l;
        M5.g.c(c1338c);
        C1338c c1338c2 = c1338c.f;
        long nanoTime = System.nanoTime();
        if (c1338c2 == null) {
            C1338c.f15379i.await(C1338c.f15380j, TimeUnit.MILLISECONDS);
            C1338c c1338c3 = C1338c.f15382l;
            M5.g.c(c1338c3);
            if (c1338c3.f != null || System.nanoTime() - nanoTime < C1338c.f15381k) {
                return null;
            }
            return C1338c.f15382l;
        }
        long j7 = c1338c2.f15384g - nanoTime;
        if (j7 > 0) {
            C1338c.f15379i.await(j7, TimeUnit.NANOSECONDS);
            return null;
        }
        C1338c c1338c4 = C1338c.f15382l;
        M5.g.c(c1338c4);
        c1338c4.f = c1338c2.f;
        c1338c2.f = null;
        return c1338c2;
    }

    public static void c(String str) {
        if (str.length() > 0) {
            int length = str.length();
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7 + 1;
                char charAt = str.charAt(i7);
                if ('!' <= charAt && charAt < 127) {
                    i7 = i8;
                } else {
                    throw new IllegalArgumentException(i6.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static void d(String str, String str2) {
        String k5;
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                String i9 = i6.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i7), str2);
                if (i6.b.q(str2)) {
                    k5 = "";
                } else {
                    k5 = M5.g.k(str, ": ");
                }
                throw new IllegalArgumentException(M5.g.k(k5, i9).toString());
            }
            i7 = i8;
        }
    }

    public static void e(InterfaceC0144m interfaceC0144m) {
        if (interfaceC0144m != null) {
            try {
                interfaceC0144m.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m3.g] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, m3.g] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, m3.g] */
    public static m3.g f(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static void h(ArrayList arrayList) {
        boolean z7;
        boolean z8;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (it.hasNext()) {
                C1069a c1069a = (C1069a) it.next();
                o4.e eVar = new o4.e(c1069a);
                for (o oVar : c1069a.f12918b) {
                    if (c1069a.f12920e == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z9 = !z8;
                    o4.f fVar = new o4.f(oVar, z9);
                    if (!hashMap.containsKey(fVar)) {
                        hashMap.put(fVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(fVar);
                    if (!set.isEmpty() && !z9) {
                        throw new IllegalArgumentException("Multiple components provide " + oVar + ".");
                    }
                    set.add(eVar);
                }
            } else {
                for (Set<o4.e> set2 : hashMap.values()) {
                    for (o4.e eVar2 : set2) {
                        for (o4.g gVar : eVar2.f12930a.f12919c) {
                            if (gVar.f12937c == 0) {
                                if (gVar.f12936b == 2) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                Set<o4.e> set3 = (Set) hashMap.get(new o4.f(gVar.f12935a, z7));
                                if (set3 != null) {
                                    for (o4.e eVar3 : set3) {
                                        eVar2.f12931b.add(eVar3);
                                        eVar3.f12932c.add(eVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    o4.e eVar4 = (o4.e) it2.next();
                    if (eVar4.f12932c.isEmpty()) {
                        hashSet2.add(eVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    o4.e eVar5 = (o4.e) hashSet2.iterator().next();
                    hashSet2.remove(eVar5);
                    i7++;
                    Iterator it3 = eVar5.f12931b.iterator();
                    while (it3.hasNext()) {
                        o4.e eVar6 = (o4.e) it3.next();
                        eVar6.f12932c.remove(eVar5);
                        if (eVar6.f12932c.isEmpty()) {
                            hashSet2.add(eVar6);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    o4.e eVar7 = (o4.e) it4.next();
                    if (!eVar7.f12932c.isEmpty() && !eVar7.f12931b.isEmpty()) {
                        arrayList2.add(eVar7.f12930a);
                    }
                }
                throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
        }
    }

    public static D5.g j(D5.g gVar, D5.h hVar) {
        M5.g.f(hVar, "key");
        if (!M5.g.a(gVar.getKey(), hVar)) {
            return null;
        }
        return gVar;
    }

    public static final int k(Bitmap bitmap) {
        Bitmap.Config config;
        int i7 = 1;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 != Bitmap.Config.ALPHA_8) {
                    i7 = 2;
                    if (config2 != Bitmap.Config.RGB_565 && config2 != Bitmap.Config.ARGB_4444) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            config = Bitmap.Config.RGBA_F16;
                            if (config2 == config) {
                                i7 = 8;
                            }
                        }
                        i7 = 4;
                    }
                }
                return height * i7;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static Application l(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static Intent m(Context context, ComponentName componentName) {
        String n = n(context, componentName);
        if (n == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), n);
        if (n(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String n(Context context, ComponentName componentName) {
        int i7;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            i7 = 269222528;
        } else if (i8 >= 24) {
            i7 = 787072;
        } else {
            i7 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i7);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static int o(int i7) {
        if (i7 < 0) {
            return -1;
        }
        if (i7 > 0) {
            return 1;
        }
        return 0;
    }

    public static final void p(View view) {
        InputMethodManager inputMethodManager;
        M5.g.f(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        view.clearFocus();
    }

    public static final boolean q(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
        }
        return false;
    }

    public static boolean r() {
        return e.d;
    }

    public static String s(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb.append(str.charAt(i7));
                if (str2.length() > i7) {
                    sb.append(str2.charAt(i7));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static D5.i t(D5.g gVar, D5.h hVar) {
        M5.g.f(hVar, "key");
        if (M5.g.a(gVar.getKey(), hVar)) {
            return D5.j.f531q;
        }
        return gVar;
    }

    public static r u(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i7 = 0;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8 + 1;
                String str = strArr2[i8];
                if (str != null) {
                    strArr2[i8] = U5.f.C0(str).toString();
                    i8 = i9;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int w7 = l.w(0, strArr2.length - 1, 2);
            if (w7 >= 0) {
                while (true) {
                    int i10 = i7 + 2;
                    String str2 = strArr2[i7];
                    String str3 = strArr2[i7 + 1];
                    c(str2);
                    d(str3, str2);
                    if (i7 == w7) {
                        break;
                    }
                    i7 = i10;
                }
            }
            return new r(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList y(Z2.y r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.d.y(Z2.y):java.util.ArrayList");
    }

    public abstract String g(byte[] bArr, int i7, int i8);

    public abstract int i(CharSequence charSequence, byte[] bArr, int i7, int i8);

    public abstract void v(int i7);

    public abstract void w(Typeface typeface, boolean z7);

    public abstract void x();

    public abstract int z(byte[] bArr, int i7, int i8);
}
