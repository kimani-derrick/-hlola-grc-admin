package J4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q  reason: collision with root package name */
    public static final c f1426q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ c[] f1427r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, J4.c] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        f1426q = r3;
        f1427r = new c[]{r3, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f1427r.clone();
    }
}
