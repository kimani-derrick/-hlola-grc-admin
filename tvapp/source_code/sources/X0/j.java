package X0;
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4072a;

    @Override // X0.h
    public boolean a(T0.f fVar) {
        return this.f4072a;
    }

    @Override // X0.h
    public boolean b() {
        return this.f4072a;
    }

    public synchronized void c() {
        this.f4072a = false;
    }

    public synchronized boolean d() {
        if (this.f4072a) {
            return false;
        }
        this.f4072a = true;
        notifyAll();
        return true;
    }
}
