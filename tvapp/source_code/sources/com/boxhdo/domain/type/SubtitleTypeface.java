package com.boxhdo.domain.type;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubtitleTypeface {

    /* renamed from: q  reason: collision with root package name */
    public static final SubtitleTypeface f8112q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ SubtitleTypeface[] f8113r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.boxhdo.domain.type.SubtitleTypeface, java.lang.Enum] */
    static {
        ?? r5 = new Enum("DEFAULT", 0);
        f8112q = r5;
        f8113r = new SubtitleTypeface[]{r5, new Enum("DEFAULT_BOLD", 1), new Enum("SANS_SERIF", 2), new Enum("SERIF", 3), new Enum("MONOSPACE", 4)};
    }

    public static SubtitleTypeface valueOf(String str) {
        return (SubtitleTypeface) Enum.valueOf(SubtitleTypeface.class, str);
    }

    public static SubtitleTypeface[] values() {
        return (SubtitleTypeface[]) f8113r.clone();
    }
}
