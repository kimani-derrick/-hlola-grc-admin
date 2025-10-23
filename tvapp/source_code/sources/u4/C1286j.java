package u4;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import t3.C1251o;
import t3.InterfaceC1243g;
import z4.C1518b;
/* renamed from: u4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286j implements InterfaceC1243g {

    /* renamed from: t  reason: collision with root package name */
    public static final C1285i f15001t = new C1285i(0);

    /* renamed from: u  reason: collision with root package name */
    public static final H.b f15002u = new H.b(16);

    /* renamed from: q  reason: collision with root package name */
    public String f15003q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f15004r;

    /* renamed from: s  reason: collision with root package name */
    public Object f15005s;

    public C1286j(CallableC1289m callableC1289m, Executor executor, String str) {
        this.f15005s = callableC1289m;
        this.f15004r = executor;
        this.f15003q = str;
    }

    public static void a(C1518b c1518b, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                c1518b.n(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e3) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e3);
            }
        }
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        String str = null;
        if (((B4.c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return m3.g.m(null);
        }
        CallableC1289m callableC1289m = (CallableC1289m) this.f15005s;
        C1251o b7 = C1292p.b(callableC1289m.f);
        C1518b c1518b = callableC1289m.f.f15031m;
        if (callableC1289m.f15012e) {
            str = this.f15003q;
        }
        return m3.g.G(Arrays.asList(b7, c1518b.v(str, (Executor) this.f15004r)));
    }

    public C1286j(C1518b c1518b) {
        this.f15003q = null;
        this.f15005s = null;
        this.f15004r = c1518b;
    }
}
