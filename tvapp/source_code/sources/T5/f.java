package T5;

import K.C0044u;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3395a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3396b;

    /* renamed from: c  reason: collision with root package name */
    public final L5.l f3397c;

    public /* synthetic */ f(int i7, L5.l lVar, Object obj) {
        this.f3395a = i7;
        this.f3396b = obj;
        this.f3397c = lVar;
    }

    @Override // T5.h
    public final Iterator iterator() {
        switch (this.f3395a) {
            case 0:
                return new e(this);
            case 1:
                return new e(this, (byte) 0);
            case 2:
                return new C0044u(this);
            default:
                return new g(this);
        }
    }

    public f(f fVar) {
        this.f3395a = 0;
        m mVar = m.f3406r;
        this.f3396b = fVar;
        this.f3397c = mVar;
    }
}
