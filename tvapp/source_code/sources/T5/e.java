package T5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class e implements Iterator, N5.a {

    /* renamed from: r  reason: collision with root package name */
    public final Iterator f3391r;

    /* renamed from: t  reason: collision with root package name */
    public Object f3393t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f3394u;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3390q = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f3392s = -1;

    public e(f fVar) {
        this.f3394u = fVar;
        this.f3391r = ((h) fVar.f3396b).iterator();
    }

    public void a() {
        int i7;
        while (true) {
            Iterator it = this.f3391r;
            if (it.hasNext()) {
                Object next = it.next();
                f fVar = (f) this.f3394u;
                boolean booleanValue = ((Boolean) fVar.f3397c.c(next)).booleanValue();
                fVar.getClass();
                if (!booleanValue) {
                    this.f3393t = next;
                    i7 = 1;
                    break;
                }
            } else {
                i7 = 0;
                break;
            }
        }
        this.f3392s = i7;
    }

    public void b() {
        Iterator it = this.f3391r;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((f) this.f3394u).f3397c.c(next)).booleanValue()) {
                this.f3392s = 1;
                this.f3393t = next;
                return;
            }
        }
        this.f3392s = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3390q) {
            case 0:
                if (this.f3392s == -1) {
                    a();
                }
                if (this.f3392s == 1) {
                    return true;
                }
                return false;
            default:
                if (this.f3392s == -1) {
                    b();
                }
                if (this.f3392s == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3390q) {
            case 0:
                if (this.f3392s == -1) {
                    a();
                }
                if (this.f3392s != 0) {
                    Object obj = this.f3393t;
                    this.f3393t = null;
                    this.f3392s = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.f3392s == -1) {
                    b();
                }
                if (this.f3392s != 0) {
                    Object obj2 = this.f3393t;
                    this.f3393t = null;
                    this.f3392s = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3390q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(f fVar, byte b7) {
        this.f3394u = fVar;
        this.f3391r = ((h) fVar.f3396b).iterator();
    }
}
