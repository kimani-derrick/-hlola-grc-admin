package p4;

import k.C0852F;
/* renamed from: p4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1090d implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13150q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f f13151r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Runnable f13152s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0852F f13153t;

    public /* synthetic */ RunnableC1090d(f fVar, Runnable runnable, C0852F c0852f, int i7) {
        this.f13150q = i7;
        this.f13151r = fVar;
        this.f13152s = runnable;
        this.f13153t = c0852f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13150q) {
            case 0:
                f fVar = this.f13151r;
                fVar.getClass();
                final Runnable runnable = this.f13152s;
                final C0852F c0852f = this.f13153t;
                fVar.f13157q.execute(new Runnable() { // from class: p4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) c0852f.f11874r).j(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c0852f.f11874r).j(e7);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                C0852F c0852f2 = c0852f;
                                try {
                                    runnable2.run();
                                    ((h) c0852f2.f11874r).i(null);
                                    return;
                                } catch (Exception e8) {
                                    ((h) c0852f2.f11874r).j(e8);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                f fVar2 = this.f13151r;
                fVar2.getClass();
                final Runnable runnable2 = this.f13152s;
                final C0852F c0852f2 = this.f13153t;
                fVar2.f13157q.execute(new Runnable() { // from class: p4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) c0852f2.f11874r).j(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c0852f2.f11874r).j(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                C0852F c0852f22 = c0852f2;
                                try {
                                    runnable22.run();
                                    ((h) c0852f22.f11874r).i(null);
                                    return;
                                } catch (Exception e8) {
                                    ((h) c0852f22.f11874r).j(e8);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                f fVar3 = this.f13151r;
                fVar3.getClass();
                final Runnable runnable3 = this.f13152s;
                final C0852F c0852f3 = this.f13153t;
                fVar3.f13157q.execute(new Runnable() { // from class: p4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) c0852f3.f11874r).j(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c0852f3.f11874r).j(e7);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                C0852F c0852f22 = c0852f3;
                                try {
                                    runnable22.run();
                                    ((h) c0852f22.f11874r).i(null);
                                    return;
                                } catch (Exception e8) {
                                    ((h) c0852f22.f11874r).j(e8);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
