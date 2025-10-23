package A5;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class r implements T5.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f133b;

    public /* synthetic */ r(int i7, Object obj) {
        this.f132a = i7;
        this.f133b = obj;
    }

    @Override // T5.h
    public final Iterator iterator() {
        switch (this.f132a) {
            case 0:
                return ((Iterable) this.f133b).iterator();
            default:
                return (Iterator) this.f133b;
        }
    }
}
