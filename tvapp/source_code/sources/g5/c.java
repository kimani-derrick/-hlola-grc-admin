package g5;

import L4.f;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q  reason: collision with root package name */
    public static final f f10844q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f10845r;

    /* renamed from: s  reason: collision with root package name */
    public static final c f10846s;

    /* renamed from: t  reason: collision with root package name */
    public static final c f10847t;

    /* renamed from: u  reason: collision with root package name */
    public static final c f10848u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ c[] f10849v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, g5.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, g5.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, g5.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, g5.c] */
    static {
        ?? r42 = new Enum("PREVIOUS_ITEM", 0);
        f10845r = r42;
        ?? r5 = new Enum("NEXT_ITEM", 1);
        f10846s = r5;
        ?? r62 = new Enum("PREVIOUS_COLUMN", 2);
        f10847t = r62;
        ?? r7 = new Enum("NEXT_COLUMN", 3);
        f10848u = r7;
        f10849v = new c[]{r42, r5, r62, r7};
        f10844q = new f(24);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f10849v.clone();
    }
}
