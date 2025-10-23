package s2;

import Z2.y;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f13590a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f13591b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f13592c = 0;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Object f13593e;

    public e() {
        int[] iArr = new int[16];
        this.f13593e = iArr;
        this.d = iArr.length - 1;
    }

    @Override // s2.d
    public int a() {
        return -1;
    }

    @Override // s2.d
    public int b() {
        return this.f13590a;
    }

    @Override // s2.d
    public int c() {
        y yVar = (y) this.f13593e;
        int i7 = this.f13591b;
        if (i7 == 8) {
            return yVar.u();
        }
        if (i7 == 16) {
            return yVar.z();
        }
        int i8 = this.f13592c;
        this.f13592c = i8 + 1;
        if (i8 % 2 == 0) {
            int u7 = yVar.u();
            this.d = u7;
            return (u7 & 240) >> 4;
        }
        return this.d & 15;
    }

    public void d(int i7) {
        int i8 = this.f13592c;
        int[] iArr = (int[]) this.f13593e;
        if (i8 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i9 = this.f13590a;
                int i10 = length2 - i9;
                System.arraycopy(iArr, i9, iArr2, 0, i10);
                System.arraycopy((int[]) this.f13593e, 0, iArr2, i10, i9);
                this.f13590a = 0;
                this.f13591b = this.f13592c - 1;
                this.f13593e = iArr2;
                this.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i11 = (this.f13591b + 1) & this.d;
        this.f13591b = i11;
        ((int[]) this.f13593e)[i11] = i7;
        this.f13592c++;
    }

    public int e() {
        int i7 = this.f13592c;
        if (i7 != 0) {
            int i8 = this.f13590a;
            int i9 = ((int[]) this.f13593e)[i8];
            this.f13590a = (i8 + 1) & this.d;
            this.f13592c = i7 - 1;
            return i9;
        }
        throw new NoSuchElementException();
    }
}
