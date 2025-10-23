package com.boxhdo.domain.type;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Quality {

    /* renamed from: q  reason: collision with root package name */
    public static final Quality f8104q;

    /* renamed from: r  reason: collision with root package name */
    public static final Quality f8105r;

    /* renamed from: s  reason: collision with root package name */
    public static final Quality f8106s;

    /* renamed from: t  reason: collision with root package name */
    public static final Quality f8107t;

    /* renamed from: u  reason: collision with root package name */
    public static final Quality f8108u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ Quality[] f8109v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, com.boxhdo.domain.type.Quality] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.boxhdo.domain.type.Quality] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.boxhdo.domain.type.Quality] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.boxhdo.domain.type.Quality] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.boxhdo.domain.type.Quality] */
    static {
        ?? r5 = new Enum("AUTO", 0);
        f8104q = r5;
        ?? r62 = new Enum("FHD", 1);
        f8105r = r62;
        ?? r7 = new Enum("HD", 2);
        f8106s = r7;
        ?? r8 = new Enum("SDP", 3);
        f8107t = r8;
        ?? r9 = new Enum("SD", 4);
        f8108u = r9;
        f8109v = new Quality[]{r5, r62, r7, r8, r9};
    }

    public static Quality valueOf(String str) {
        return (Quality) Enum.valueOf(Quality.class, str);
    }

    public static Quality[] values() {
        return (Quality[]) f8109v.clone();
    }
}
