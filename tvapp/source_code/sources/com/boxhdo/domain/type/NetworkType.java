package com.boxhdo.domain.type;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NetworkType {

    /* renamed from: q  reason: collision with root package name */
    public static final NetworkType f8100q;

    /* renamed from: r  reason: collision with root package name */
    public static final NetworkType f8101r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f8102s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, com.boxhdo.domain.type.NetworkType] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.boxhdo.domain.type.NetworkType] */
    static {
        ?? r22 = new Enum("COMPANIES", 0);
        f8100q = r22;
        ?? r3 = new Enum("NETWORKS", 1);
        f8101r = r3;
        f8102s = new NetworkType[]{r22, r3};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f8102s.clone();
    }
}
