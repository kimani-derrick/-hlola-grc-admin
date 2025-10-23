package K2;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class d extends LinkedHashMap {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1654q = 4;

    public d(int i7) {
        super(i7, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f1654q) {
            return true;
        }
        return false;
    }
}
