package com.boxhdo.domain.type;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SourceType {

    /* renamed from: q  reason: collision with root package name */
    public static final SourceType f8110q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ SourceType[] f8111r;
    /* JADX INFO: Fake field, exist only in values array */
    SourceType EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.boxhdo.domain.type.SourceType] */
    static {
        Enum r3 = new Enum("HLS", 0);
        Enum r42 = new Enum("MP4", 1);
        ?? r5 = new Enum("AUTO", 2);
        f8110q = r5;
        f8111r = new SourceType[]{r3, r42, r5};
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) f8111r.clone();
    }
}
