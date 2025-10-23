package D;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public class i extends h4.b {

    /* renamed from: a  reason: collision with root package name */
    public static Class f437a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor f438b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f439c = null;
    public static Method d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f440e = false;

    public static boolean J(Object obj, String str, int i7, boolean z7) {
        K();
        try {
            return ((Boolean) f439c.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void K() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f440e) {
            return;
        }
        f440e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f438b = constructor;
        f437a = cls;
        f439c = method2;
        d = method;
    }

    @Override // h4.b
    public Typeface k(Context context, C.g gVar, Resources resources, int i7) {
        C.h[] hVarArr;
        K();
        try {
            Object newInstance = f438b.newInstance(null);
            for (C.h hVar : gVar.f327a) {
                File t5 = AbstractC0958a.t(context);
                if (t5 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0958a.k(t5, resources, hVar.f)) {
                        return null;
                    }
                    if (!J(newInstance, t5.getPath(), hVar.f329b, hVar.f330c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    t5.delete();
                }
            }
            K();
            try {
                Object newInstance2 = Array.newInstance(f437a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // h4.b
    public Typeface l(Context context, H.k[] kVarArr, int i7) {
        File file;
        String readlink;
        if (kVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u(kVarArr, i7).f795a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface m7 = m(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return m7;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface m72 = m(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return m72;
        } catch (IOException unused2) {
            return null;
        }
    }
}
