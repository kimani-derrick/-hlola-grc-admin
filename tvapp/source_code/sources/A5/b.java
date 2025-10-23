package A5;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public class b implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f119q;

    /* renamed from: r  reason: collision with root package name */
    public int f120r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f121s;

    public /* synthetic */ b(int i7, Object obj) {
        this.f119q = i7;
        this.f121s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f119q) {
            case 0:
                if (this.f120r < ((e) this.f121s).b()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f120r < ((ViewGroup) this.f121s).getChildCount()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f120r < ((Object[]) this.f121s).length) {
                    return true;
                }
                return false;
            case 3:
                break;
            default:
                if (this.f120r < ((o.k) this.f121s).k()) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i7 = this.f120r;
            it = (Iterator) this.f121s;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f120r--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f119q) {
            case 0:
                if (hasNext()) {
                    int i7 = this.f120r;
                    this.f120r = i7 + 1;
                    return ((e) this.f121s).get(i7);
                }
                throw new NoSuchElementException();
            case 1:
                int i8 = this.f120r;
                this.f120r = i8 + 1;
                View childAt = ((ViewGroup) this.f121s).getChildAt(i8);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                try {
                    int i9 = this.f120r;
                    this.f120r = i9 + 1;
                    return ((Object[]) this.f121s)[i9];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f120r--;
                    throw new NoSuchElementException(e3.getMessage());
                }
            case 3:
                break;
            default:
                int i10 = this.f120r;
                this.f120r = i10 + 1;
                return ((o.k) this.f121s).l(i10);
        }
        while (true) {
            int i11 = this.f120r;
            it = (Iterator) this.f121s;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f120r--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f119q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i7 = this.f120r - 1;
                this.f120r = i7;
                ((ViewGroup) this.f121s).removeViewAt(i7);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(T5.b bVar) {
        this.f119q = 3;
        this.f121s = bVar.f3387a.iterator();
        this.f120r = bVar.f3388b;
    }

    public b(Object[] objArr) {
        this.f119q = 2;
        M5.g.f(objArr, "array");
        this.f121s = objArr;
    }
}
