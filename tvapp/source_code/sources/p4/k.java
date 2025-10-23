package p4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public static final k f13168q;

    /* renamed from: r  reason: collision with root package name */
    public static final Handler f13169r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ k[] f13170s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p4.k, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f13168q = r12;
        f13170s = new k[]{r12};
        f13169r = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f13170s.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f13169r.post(runnable);
    }
}
