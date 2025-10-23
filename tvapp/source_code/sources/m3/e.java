package m3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.internal.measurement.F;
import dalvik.system.PathClassLoader;
import g3.n;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import l3.BinderC0971b;
import o3.AbstractC1068b;
/* loaded from: classes.dex */
public final class e {
    public static Boolean d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f12419e = null;
    public static boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public static int f12420g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f12421h;

    /* renamed from: l  reason: collision with root package name */
    public static k f12425l;

    /* renamed from: m  reason: collision with root package name */
    public static l f12426m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12427a;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal f12422i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public static final P5.b f12423j = new P5.b(7);

    /* renamed from: k  reason: collision with root package name */
    public static final J3.e f12424k = new J3.e(29);

    /* renamed from: b  reason: collision with root package name */
    public static final L4.f f12417b = new L4.f(29);

    /* renamed from: c  reason: collision with root package name */
    public static final i f12418c = new i(0);

    public e(Context context) {
        this.f12427a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!n.j(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        if (r10 != 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [m3.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m3.e c(android.content.Context r23, m3.d r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.e.c(android.content.Context, m3.d, java.lang.String):m3.e");
    }

    public static int d(Context context, String str, boolean z7) {
        Field declaredField;
        Throwable th;
        RemoteException e3;
        int readInt;
        j jVar;
        Cursor cursor;
        try {
            synchronized (e.class) {
                Boolean bool = d;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e7) {
                        String obj = e7.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (b unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!g(context)) {
                            return 0;
                        } else {
                            if (!f) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e8 = e(context, str, z7, true);
                                        String str2 = f12419e;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader I6 = g.I();
                                            if (I6 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC0995a.b();
                                                    String str3 = f12419e;
                                                    n.g(str3);
                                                    I6 = AbstractC0995a.a(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = f12419e;
                                                    n.g(str4);
                                                    I6 = new PathClassLoader(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            f(I6);
                                            declaredField.set(null, I6);
                                            d = bool2;
                                            return e8;
                                        }
                                        return e8;
                                    } catch (b unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z7, false);
                    } catch (b e9) {
                        String message = e9.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                k h7 = h(context);
                if (h7 == null) {
                    return 0;
                }
                try {
                    try {
                        Parcel z8 = h7.z(h7.A(), 6);
                        int readInt2 = z8.readInt();
                        z8.recycle();
                        if (readInt2 >= 3) {
                            ThreadLocal threadLocal = f12422i;
                            j jVar2 = (j) threadLocal.get();
                            if (jVar2 != null && (cursor = jVar2.f12432a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) BinderC0971b.A(h7.G(new BinderC0971b(context), str, z7, ((Long) f12423j.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        readInt = cursor3.getInt(0);
                                        if (readInt > 0 && (jVar = (j) threadLocal.get()) != null && jVar.f12432a == null) {
                                            jVar.f12432a = cursor3;
                                        } else {
                                            cursor2 = cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e10) {
                                    e3 = e10;
                                    cursor2 = cursor3;
                                    String message2 = e3.getMessage();
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        } else if (readInt2 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            BinderC0971b binderC0971b = new BinderC0971b(context);
                            Parcel A6 = h7.A();
                            AbstractC1068b.c(A6, binderC0971b);
                            A6.writeString(str);
                            A6.writeInt(z7 ? 1 : 0);
                            Parcel z9 = h7.z(A6, 5);
                            readInt = z9.readInt();
                            z9.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            BinderC0971b binderC0971b2 = new BinderC0971b(context);
                            Parcel A7 = h7.A();
                            AbstractC1068b.c(A7, binderC0971b2);
                            A7.writeString(str);
                            A7.writeInt(z7 ? 1 : 0);
                            Parcel z10 = h7.z(A7, 3);
                            readInt = z10.readInt();
                            z10.recycle();
                        }
                        return readInt;
                    } catch (RemoteException e11) {
                        e3 = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            try {
                n.g(context);
            } catch (Exception e12) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
            }
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.measurement.F] */
    public static void f(ClassLoader classLoader) {
        try {
            l lVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof l) {
                    lVar = (l) queryLocalInterface;
                } else {
                    lVar = new F(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
                }
            }
            f12426m = lVar;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e9) {
            e = e9;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e10) {
            e = e10;
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f12421h)) {
            return true;
        }
        boolean z7 = false;
        if (f12421h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            d3.d.f9227b.getClass();
            if (d3.d.a(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z7 = true;
            }
            f12421h = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k h(Context context) {
        k kVar;
        synchronized (e.class) {
            k kVar2 = f12425l;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof k) {
                        kVar = (k) queryLocalInterface;
                    } else {
                        kVar = new F(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                    }
                }
                if (kVar != 0) {
                    f12425l = kVar;
                    return kVar;
                }
            } catch (Exception e3) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e3.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f12427a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}
