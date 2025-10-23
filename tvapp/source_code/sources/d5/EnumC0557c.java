package d5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0557c {

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC0557c f9258q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0557c f9259r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ EnumC0557c[] f9260s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, d5.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, d5.c] */
    static {
        ?? r3 = new Enum("NONE", 0);
        f9258q = r3;
        Enum r42 = new Enum("MAX", 1);
        ?? r5 = new Enum("MIN_MAX", 2);
        f9259r = r5;
        f9260s = new EnumC0557c[]{r3, r42, r5};
    }

    public static EnumC0557c valueOf(String str) {
        return (EnumC0557c) Enum.valueOf(EnumC0557c.class, str);
    }

    public static EnumC0557c[] values() {
        return (EnumC0557c[]) f9260s.clone();
    }
}
