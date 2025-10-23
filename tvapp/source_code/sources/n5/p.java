package n5;

import java.io.IOException;
import java.util.Arrays;
import v6.C1341f;
import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f12718y = new String[128];

    /* renamed from: w  reason: collision with root package name */
    public final InterfaceC1342g f12719w;

    /* renamed from: x  reason: collision with root package name */
    public String f12720x;

    static {
        for (int i7 = 0; i7 <= 31; i7++) {
            f12718y[i7] = String.format("\\u%04x", Integer.valueOf(i7));
        }
        String[] strArr = f12718y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public p(C1341f c1341f) {
        int[] iArr = new int[32];
        this.f12722r = iArr;
        this.f12723s = new String[32];
        this.f12724t = new int[32];
        this.f12726v = -1;
        this.f12719w = c1341f;
        this.f12721q = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void X(v6.InterfaceC1342g r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = n5.p.f12718y
            r1 = 34
            r7.N(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.q(r4, r3, r8)
        L2e:
            r7.G(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.q(r4, r2, r8)
        L3b:
            r7.N(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.p.X(v6.g, java.lang.String):void");
    }

    public final void O() {
        int r3 = r();
        int i7 = 2;
        if (r3 != 1) {
            InterfaceC1342g interfaceC1342g = this.f12719w;
            if (r3 != 2) {
                if (r3 != 4) {
                    if (r3 != 9) {
                        if (r3 != 6) {
                            if (r3 == 7) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                            throw new IllegalStateException("Nesting problem.");
                        }
                        i7 = 7;
                    } else {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                } else {
                    interfaceC1342g.G(":");
                    i7 = 5;
                }
            } else {
                interfaceC1342g.N(44);
            }
        }
        this.f12722r[this.f12721q - 1] = i7;
    }

    public final void V(int i7, int i8, char c5) {
        int r3 = r();
        if (r3 != i8 && r3 != i7) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f12720x == null) {
            int i9 = this.f12721q;
            int i10 = ~this.f12726v;
            if (i9 == i10) {
                this.f12726v = i10;
                return;
            }
            int i11 = i9 - 1;
            this.f12721q = i11;
            this.f12723s[i11] = null;
            int[] iArr = this.f12724t;
            int i12 = i9 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f12719w.N(c5);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f12720x);
    }

    public final void W(int i7, int i8, char c5) {
        int i9;
        int i10 = this.f12721q;
        int i11 = this.f12726v;
        if (i10 == i11 && ((i9 = this.f12722r[i10 - 1]) == i7 || i9 == i8)) {
            this.f12726v = ~i11;
            return;
        }
        O();
        int i12 = this.f12721q;
        int[] iArr = this.f12722r;
        if (i12 == iArr.length) {
            if (i12 != 256) {
                this.f12722r = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f12723s;
                this.f12723s = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f12724t;
                this.f12724t = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + h() + ": circular reference?");
            }
        }
        int[] iArr3 = this.f12722r;
        int i13 = this.f12721q;
        this.f12721q = i13 + 1;
        iArr3[i13] = i7;
        this.f12724t[i13] = 0;
        this.f12719w.N(c5);
    }

    public final void Y() {
        if (this.f12720x != null) {
            int r3 = r();
            InterfaceC1342g interfaceC1342g = this.f12719w;
            if (r3 == 5) {
                interfaceC1342g.N(44);
            } else if (r3 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f12722r[this.f12721q - 1] = 4;
            X(interfaceC1342g, this.f12720x);
            this.f12720x = null;
        }
    }

    @Override // n5.q
    public final p a() {
        if (!this.f12725u) {
            Y();
            W(1, 2, '[');
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + h());
    }

    @Override // n5.q
    public final p b() {
        if (!this.f12725u) {
            Y();
            W(3, 5, '{');
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + h());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12719w.close();
        int i7 = this.f12721q;
        if (i7 <= 1 && (i7 != 1 || this.f12722r[i7 - 1] == 7)) {
            this.f12721q = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // n5.q
    public final p f() {
        this.f12725u = false;
        V(3, 5, '}');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f12721q != 0) {
            this.f12719w.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // n5.q
    public final p j(String str) {
        if (str != null) {
            if (this.f12721q != 0) {
                int r3 = r();
                if ((r3 == 3 || r3 == 5) && this.f12720x == null && !this.f12725u) {
                    this.f12720x = str;
                    this.f12723s[this.f12721q - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // n5.q
    public final p n() {
        if (!this.f12725u) {
            if (this.f12720x != null) {
                this.f12720x = null;
                return this;
            }
            O();
            this.f12719w.G("null");
            int[] iArr = this.f12724t;
            int i7 = this.f12721q - 1;
            iArr[i7] = iArr[i7] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + h());
    }

    @Override // n5.q
    public final p x(long j7) {
        if (this.f12725u) {
            this.f12725u = false;
            j(Long.toString(j7));
            return this;
        }
        Y();
        O();
        this.f12719w.G(Long.toString(j7));
        int[] iArr = this.f12724t;
        int i7 = this.f12721q - 1;
        iArr[i7] = iArr[i7] + 1;
        return this;
    }

    @Override // n5.q
    public final p y(String str) {
        if (str == null) {
            n();
            return this;
        } else if (this.f12725u) {
            this.f12725u = false;
            j(str);
            return this;
        } else {
            Y();
            O();
            X(this.f12719w, str);
            int[] iArr = this.f12724t;
            int i7 = this.f12721q - 1;
            iArr[i7] = iArr[i7] + 1;
            return this;
        }
    }
}
