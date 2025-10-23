package D;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public class k extends i {
    public final Class f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor f444g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f445h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f446i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f447j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f448k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f449l;

    public k() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = R(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.f444g = constructor;
        this.f445h = method2;
        this.f446i = method3;
        this.f447j = method4;
        this.f448k = method5;
        this.f449l = method;
    }

    public static Method R(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void L(Object obj) {
        try {
            this.f448k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean M(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f445h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f449l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean O(Object obj) {
        try {
            return ((Boolean) this.f447j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean P() {
        Method method = this.f445h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object Q() {
        try {
            return this.f444g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method S(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // D.i, h4.b
    public final Typeface k(Context context, C.g gVar, Resources resources, int i7) {
        C.h[] hVarArr;
        if (!P()) {
            return super.k(context, gVar, resources, i7);
        }
        Object Q4 = Q();
        if (Q4 == null) {
            return null;
        }
        for (C.h hVar : gVar.f327a) {
            if (!M(context, Q4, hVar.f328a, hVar.f331e, hVar.f329b, hVar.f330c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                L(Q4);
                return null;
            }
        }
        if (!O(Q4)) {
            return null;
        }
        return N(Q4);
    }

    @Override // D.i, h4.b
    public final Typeface l(Context context, H.k[] kVarArr, int i7) {
        Typeface N6;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!P()) {
            H.k u7 = u(kVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u7.f795a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(u7.f797c).setItalic(u7.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (H.k kVar : kVarArr) {
            if (kVar.f798e == 0) {
                Uri uri = kVar.f795a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0958a.z(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object Q4 = Q();
        if (Q4 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < length) {
            H.k kVar2 = kVarArr[i8];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f795a);
            if (byteBuffer != null) {
                if (((Boolean) this.f446i.invoke(Q4, byteBuffer, Integer.valueOf(kVar2.f796b), null, Integer.valueOf(kVar2.f797c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue()) {
                    z7 = true;
                } else {
                    L(Q4);
                    return null;
                }
            }
            i8++;
            z7 = z7;
        }
        if (!z7) {
            L(Q4);
            return null;
        } else if (!O(Q4) || (N6 = N(Q4)) == null) {
            return null;
        } else {
            return Typeface.create(N6, i7);
        }
    }

    @Override // h4.b
    public final Typeface n(Context context, Resources resources, int i7, String str, int i8) {
        if (!P()) {
            return super.n(context, resources, i7, str, i8);
        }
        Object Q4 = Q();
        if (Q4 == null) {
            return null;
        }
        if (!M(context, Q4, str, 0, -1, -1, null)) {
            L(Q4);
            return null;
        } else if (!O(Q4)) {
            return null;
        } else {
            return N(Q4);
        }
    }
}
