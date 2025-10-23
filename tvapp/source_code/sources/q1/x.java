package q1;

import androidx.leanback.widget.AbstractC0281a0;
import androidx.leanback.widget.AbstractC0283b0;
import com.boxhdo.domain.model.ContinueWatch;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Network;
import z5.C1527i;
/* loaded from: classes.dex */
public final class x extends AbstractC0283b0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1527i f13273a = new C1527i(w.f13269s);

    /* renamed from: b  reason: collision with root package name */
    public final C1527i f13274b = new C1527i(w.f13270t);

    /* renamed from: c  reason: collision with root package name */
    public final C1527i f13275c = new C1527i(w.f13271u);

    @Override // androidx.leanback.widget.AbstractC0283b0
    public final AbstractC0281a0 a(Object obj) {
        boolean z7 = obj instanceof Movie;
        C1527i c1527i = this.f13273a;
        if (z7) {
            return (z) c1527i.getValue();
        }
        if (obj instanceof Network) {
            return (C1098B) this.f13274b.getValue();
        }
        if (obj instanceof ContinueWatch) {
            return (v) this.f13275c.getValue();
        }
        return (z) c1527i.getValue();
    }

    @Override // androidx.leanback.widget.AbstractC0283b0
    public final AbstractC0281a0[] b() {
        return new AbstractC0281a0[]{(z) this.f13273a.getValue(), (C1098B) this.f13274b.getValue()};
    }
}
