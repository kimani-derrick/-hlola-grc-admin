package O3;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class K implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public static final K f2610q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ K[] f2611r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, O3.K] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2610q = r12;
        f2611r = new K[]{r12};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f2611r.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        android.support.v4.media.session.b.o("no calls to next() since the last call to remove()", false);
    }
}
