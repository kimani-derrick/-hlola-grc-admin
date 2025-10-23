package X0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.boxhdo.android.tv.R;
import h6.r;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap.Config[] f4059a;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config f4060b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f4061c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f4059a = configArr;
        if (i7 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f4060b = config;
        Object[] array = new ArrayList(20).toArray(new String[0]);
        if (array != null) {
            f4061c = new r((String[]) array);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !U5.n.X(str)) {
            String A02 = U5.f.A0(U5.f.A0(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(U5.f.y0(U5.f.y0(A02, '/', A02), '.', ""));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static final S0.r c(View view) {
        S0.r rVar;
        Object tag = view.getTag(R.id.coil_request_manager);
        S0.r rVar2 = null;
        if (tag instanceof S0.r) {
            rVar = (S0.r) tag;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            synchronized (view) {
                try {
                    Object tag2 = view.getTag(R.id.coil_request_manager);
                    if (tag2 instanceof S0.r) {
                        rVar2 = (S0.r) tag2;
                    }
                    if (rVar2 != null) {
                        rVar = rVar2;
                    } else {
                        ?? obj = new Object();
                        view.addOnAttachStateChangeListener(obj);
                        view.setTag(R.id.coil_request_manager, obj);
                        rVar = obj;
                    }
                } finally {
                }
            }
        }
        return rVar;
    }

    public static final File d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    public static final boolean e(Uri uri) {
        if (M5.g.a(uri.getScheme(), "file") && M5.g.a((String) A5.k.X(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int f(h4.b bVar, int i7) {
        if (bVar instanceof T0.a) {
            return ((T0.a) bVar).f3200a;
        }
        int b7 = s.h.b(i7);
        if (b7 != 0) {
            if (b7 == 1) {
                return Integer.MAX_VALUE;
            }
            throw new RuntimeException();
        }
        return Integer.MIN_VALUE;
    }
}
