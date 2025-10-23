package A5;

import java.util.AbstractSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class g extends AbstractSet implements Set, N5.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
