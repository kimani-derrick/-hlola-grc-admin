package O3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class N extends AbstractC0072p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f2615a;

    public N(S s6) {
        this.f2615a = s6;
    }

    @Override // O3.AbstractC0072p
    public final Map d() {
        return new TreeMap(this.f2615a);
    }
}
