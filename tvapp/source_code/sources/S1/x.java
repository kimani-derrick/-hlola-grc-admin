package S1;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: q  reason: collision with root package name */
    public static final x f3133q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ x[] f3134r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, java.lang.Object, S1.x] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        f3133q = r62;
        Enum r7 = new Enum("UNMETERED_ONLY", 1);
        Enum r8 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r9 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r10 = new Enum("NEVER", 4);
        Enum r11 = new Enum("UNRECOGNIZED", 5);
        f3134r = new x[]{r62, r7, r8, r9, r10, r11};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r7);
        sparseArray.put(2, r8);
        sparseArray.put(3, r9);
        sparseArray.put(4, r10);
        sparseArray.put(-1, r11);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f3134r.clone();
    }
}
