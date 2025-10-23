package O2;

import Z2.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import m4.C0997b;
import v.AbstractC1313n;
import v.C1310k;
/* loaded from: classes.dex */
public final class e implements s2.d {

    /* renamed from: a  reason: collision with root package name */
    public int f2559a;

    /* renamed from: b  reason: collision with root package name */
    public int f2560b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2561c;

    public e() {
        this.f2561c = new e[256];
        this.f2559a = 0;
        this.f2560b = 0;
    }

    @Override // s2.d
    public int a() {
        return this.f2559a;
    }

    @Override // s2.d
    public int b() {
        return this.f2560b;
    }

    @Override // s2.d
    public int c() {
        int i7 = this.f2559a;
        if (i7 == -1) {
            return ((y) this.f2561c).x();
        }
        return i7;
    }

    public void d(int i7) {
        int[] iArr = (int[]) this.f2561c;
        int i8 = this.f2559a;
        iArr[i8] = i7;
        int i9 = this.f2560b & (i8 + 1);
        this.f2559a = i9;
        if (i9 == 0) {
            int length = iArr.length;
            int i10 = length << 1;
            if (i10 >= 0) {
                int[] iArr2 = new int[i10];
                A5.j.P(0, 0, length, iArr, iArr2);
                A5.j.P(length, 0, 0, (int[]) this.f2561c, iArr2);
                this.f2561c = iArr2;
                this.f2559a = length;
                this.f2560b = i10 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void e() {
        o.i iVar;
        int i7;
        int i8 = this.f2559a;
        if (i8 == 2) {
            if (this.f2560b > 0) {
                o.i iVar2 = (o.i) this.f2561c;
                if (iVar2 != null) {
                    synchronized (((C0997b) iVar2.f12806g)) {
                        i7 = iVar2.f12803b;
                    }
                    if (i7 == this.f2560b) {
                        return;
                    }
                }
                iVar = new o.i(this.f2560b);
            } else {
                throw new IllegalArgumentException();
            }
        } else if (i8 != 3 && i8 != 1) {
            iVar = null;
        } else {
            o.i iVar3 = (o.i) this.f2561c;
            if (iVar3 == null || iVar3.l() != Integer.MAX_VALUE) {
                iVar = new o.i(Integer.MAX_VALUE);
            } else {
                return;
            }
        }
        this.f2561c = iVar;
    }

    public boolean f() {
        int i7;
        int i8 = this.f2560b;
        if (i8 == 0) {
            return false;
        }
        if (i8 > 0) {
            i7 = i8 - 1;
        } else {
            i7 = i8 + 1;
        }
        this.f2560b = i7;
        return true;
    }

    public int g(int i7) {
        if (i7 >= 0) {
            int i8 = this.f2559a;
            int i9 = this.f2560b;
            if (i7 < (i8 & i9)) {
                return ((int[]) this.f2561c)[i7 & i9];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        if (this.f2560b != 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (h()) {
            h5.d dVar = (h5.d) this.f2561c;
            if (dVar.f11023h || (dVar.r() ? (!dVar.o() || this.f2560b >= 0) && (!dVar.n() || this.f2560b <= 0) : (!dVar.n() || this.f2560b >= 0) && (!dVar.o() || this.f2560b <= 0))) {
                return false;
            }
        }
        return true;
    }

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f2561c = new ArrayList();
        this.f2560b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1313n.f15242g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f2559a = obtainStyledAttributes.getResourceId(index, this.f2559a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2560b);
                this.f2560b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1310k().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
