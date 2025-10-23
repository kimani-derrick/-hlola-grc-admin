package p4;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: q  reason: collision with root package name */
    public static final i f13160q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ i[] f13161r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, p4.i] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f13160q = r12;
        f13161r = new i[]{r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f13161r.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
