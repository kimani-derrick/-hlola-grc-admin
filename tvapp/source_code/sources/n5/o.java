package n5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.EOFException;
import java.io.IOException;
import u4.C1288l;
import v6.C1341f;
import v6.C1344i;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: A  reason: collision with root package name */
    public static final C1344i f12707A;

    /* renamed from: B  reason: collision with root package name */
    public static final C1344i f12708B;

    /* renamed from: C  reason: collision with root package name */
    public static final C1344i f12709C;

    /* renamed from: D  reason: collision with root package name */
    public static final C1344i f12710D;

    /* renamed from: E  reason: collision with root package name */
    public static final C1344i f12711E;

    /* renamed from: u  reason: collision with root package name */
    public final InterfaceC1343h f12712u;

    /* renamed from: v  reason: collision with root package name */
    public final C1341f f12713v;

    /* renamed from: w  reason: collision with root package name */
    public int f12714w;

    /* renamed from: x  reason: collision with root package name */
    public long f12715x;

    /* renamed from: y  reason: collision with root package name */
    public int f12716y;

    /* renamed from: z  reason: collision with root package name */
    public String f12717z;

    static {
        C1344i c1344i = C1344i.f15389t;
        f12707A = C1288l.e("'\\");
        f12708B = C1288l.e("\"\\");
        f12709C = C1288l.e("{}[]:, \n\t\r\f/\\;#=");
        f12710D = C1288l.e("\n\r");
        f12711E = C1288l.e("*/");
    }

    public o(InterfaceC1343h interfaceC1343h) {
        this.f12704r = new int[32];
        this.f12705s = new String[32];
        this.f12706t = new int[32];
        this.f12714w = 0;
        this.f12712u = interfaceC1343h;
        this.f12713v = interfaceC1343h.c();
        W(6);
    }

    @Override // n5.n
    public final String O() {
        String a02;
        C1344i c1344i;
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 10) {
            a02 = j0();
        } else {
            if (i7 == 9) {
                c1344i = f12708B;
            } else if (i7 == 8) {
                c1344i = f12707A;
            } else if (i7 == 11) {
                a02 = this.f12717z;
                this.f12717z = null;
            } else if (i7 == 16) {
                a02 = Long.toString(this.f12715x);
            } else if (i7 == 17) {
                C1341f c1341f = this.f12713v;
                c1341f.getClass();
                a02 = c1341f.a0(this.f12716y, U5.a.f3474a);
            } else {
                throw new RuntimeException("Expected a string but was " + AbstractC0515y1.z(V()) + " at path " + j());
            }
            a02 = i0(c1344i);
        }
        this.f12714w = 0;
        int[] iArr = this.f12706t;
        int i8 = this.f12703q - 1;
        iArr[i8] = iArr[i8] + 1;
        return a02;
    }

    @Override // n5.n
    public final int V() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        switch (i7) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // n5.n
    public final int X(androidx.fragment.app.D d) {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 < 12 || i7 > 15) {
            return -1;
        }
        if (i7 == 15) {
            return d0(this.f12717z, d);
        }
        int z7 = this.f12712u.z((v6.u) d.f5884s);
        if (z7 != -1) {
            this.f12714w = 0;
            this.f12705s[this.f12703q - 1] = ((String[]) d.f5883r)[z7];
            return z7;
        }
        String str = this.f12705s[this.f12703q - 1];
        String g02 = g0();
        int d02 = d0(g02, d);
        if (d02 == -1) {
            this.f12714w = 15;
            this.f12717z = g02;
            this.f12705s[this.f12703q - 1] = str;
        }
        return d02;
    }

    @Override // n5.n
    public final void Y() {
        C1344i c1344i;
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 14) {
            long u7 = this.f12712u.u(f12709C);
            int i8 = (u7 > (-1L) ? 1 : (u7 == (-1L) ? 0 : -1));
            C1341f c1341f = this.f12713v;
            if (i8 == 0) {
                u7 = c1341f.f15388r;
            }
            c1341f.p(u7);
        } else {
            if (i7 == 13) {
                c1344i = f12708B;
            } else if (i7 == 12) {
                c1344i = f12707A;
            } else if (i7 != 15) {
                throw new RuntimeException("Expected a name but was " + AbstractC0515y1.z(V()) + " at path " + j());
            }
            l0(c1344i);
        }
        this.f12714w = 0;
        this.f12705s[this.f12703q - 1] = "null";
    }

    @Override // n5.n
    public final void Z() {
        C1344i c1344i;
        int i7 = 0;
        do {
            int i8 = this.f12714w;
            if (i8 == 0) {
                i8 = c0();
            }
            if (i8 == 3) {
                W(1);
            } else if (i8 == 1) {
                W(3);
            } else {
                if (i8 == 4) {
                    i7--;
                    if (i7 >= 0) {
                        this.f12703q--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC0515y1.z(V()) + " at path " + j());
                    }
                } else if (i8 == 2) {
                    i7--;
                    if (i7 >= 0) {
                        this.f12703q--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC0515y1.z(V()) + " at path " + j());
                    }
                } else {
                    C1341f c1341f = this.f12713v;
                    if (i8 != 14 && i8 != 10) {
                        if (i8 != 9 && i8 != 13) {
                            if (i8 != 8 && i8 != 12) {
                                if (i8 == 17) {
                                    c1341f.p(this.f12716y);
                                } else if (i8 == 18) {
                                    throw new RuntimeException("Expected a value but was " + AbstractC0515y1.z(V()) + " at path " + j());
                                }
                            } else {
                                c1344i = f12707A;
                            }
                        } else {
                            c1344i = f12708B;
                        }
                        l0(c1344i);
                    } else {
                        long u7 = this.f12712u.u(f12709C);
                        if (u7 == -1) {
                            u7 = c1341f.f15388r;
                        }
                        c1341f.p(u7);
                    }
                }
                this.f12714w = 0;
            }
            i7++;
            this.f12714w = 0;
        } while (i7 != 0);
        int[] iArr = this.f12706t;
        int i9 = this.f12703q - 1;
        iArr[i9] = iArr[i9] + 1;
        this.f12705s[i9] = "null";
    }

    @Override // n5.n
    public final void a() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 3) {
            W(1);
            this.f12706t[this.f12703q - 1] = 0;
            this.f12714w = 0;
            return;
        }
        throw new RuntimeException("Expected BEGIN_ARRAY but was " + AbstractC0515y1.z(V()) + " at path " + j());
    }

    @Override // n5.n
    public final void b() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 1) {
            W(3);
            this.f12714w = 0;
            return;
        }
        throw new RuntimeException("Expected BEGIN_OBJECT but was " + AbstractC0515y1.z(V()) + " at path " + j());
    }

    public final void b0() {
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b1, code lost:
        if (f0(r7) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b4, code lost:
        if (r2 != 2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
        if (r5 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01bc, code lost:
        if (r16 != Long.MIN_VALUE) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01be, code lost:
        if (r6 == 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c3, code lost:
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c7, code lost:
        if (r16 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c9, code lost:
        if (r6 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cb, code lost:
        if (r6 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01cd, code lost:
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d0, code lost:
        r8 = -r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01d3, code lost:
        r19.f12715x = r8;
        r11.p(r4);
        r10 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01db, code lost:
        r19.f12714w = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01de, code lost:
        if (r2 == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e1, code lost:
        if (r2 == 4) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01e4, code lost:
        if (r2 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01e6, code lost:
        r19.f12716y = r4;
        r10 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013b, code lost:
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c0() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.o.c0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12714w = 0;
        this.f12704r[0] = 8;
        this.f12703q = 1;
        this.f12713v.b();
        this.f12712u.close();
    }

    public final int d0(String str, androidx.fragment.app.D d) {
        int length = ((String[]) d.f5883r).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) d.f5883r)[i7])) {
                this.f12714w = 0;
                this.f12705s[this.f12703q - 1] = str;
                return i7;
            }
        }
        return -1;
    }

    public final int e0(String str, androidx.fragment.app.D d) {
        int length = ((String[]) d.f5883r).length;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(((String[]) d.f5883r)[i7])) {
                this.f12714w = 0;
                int[] iArr = this.f12706t;
                int i8 = this.f12703q - 1;
                iArr[i8] = iArr[i8] + 1;
                return i7;
            }
        }
        return -1;
    }

    @Override // n5.n
    public final void f() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 4) {
            int i8 = this.f12703q;
            this.f12703q = i8 - 1;
            int[] iArr = this.f12706t;
            int i9 = i8 - 2;
            iArr[i9] = iArr[i9] + 1;
            this.f12714w = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + AbstractC0515y1.z(V()) + " at path " + j());
    }

    public final boolean f0(int i7) {
        if (i7 != 9 && i7 != 10 && i7 != 12 && i7 != 13 && i7 != 32) {
            if (i7 != 35) {
                if (i7 != 44) {
                    if (i7 != 47 && i7 != 61) {
                        if (i7 != 123 && i7 != 125 && i7 != 58) {
                            if (i7 != 59) {
                                switch (i7) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            b0();
            return false;
        }
        return false;
    }

    public final String g0() {
        String str;
        C1344i c1344i;
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 14) {
            str = j0();
        } else {
            if (i7 == 13) {
                c1344i = f12708B;
            } else if (i7 == 12) {
                c1344i = f12707A;
            } else if (i7 == 15) {
                str = this.f12717z;
                this.f12717z = null;
            } else {
                throw new RuntimeException("Expected a name but was " + AbstractC0515y1.z(V()) + " at path " + j());
            }
            str = i0(c1344i);
        }
        this.f12714w = 0;
        this.f12705s[this.f12703q - 1] = str;
        return str;
    }

    @Override // n5.n
    public final void h() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 2) {
            int i8 = this.f12703q;
            int i9 = i8 - 1;
            this.f12703q = i9;
            this.f12705s[i9] = null;
            int[] iArr = this.f12706t;
            int i10 = i8 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.f12714w = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + AbstractC0515y1.z(V()) + " at path " + j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
        r1.p(r3);
        r2 = n5.o.f12710D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r6 != 47) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r5.t(2) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        b0();
        r10 = r1.y(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r10 == 42) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r10 == 47) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        r1.readByte();
        r1.readByte();
        r5 = r5.u(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r5 == (-1)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r5 = r1.f15388r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        r1.p(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        r1.readByte();
        r1.readByte();
        r5 = r5.J(n5.o.f12711E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r5 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        r5 = r5 + r2.f15390q.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
        r5 = r1.f15388r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        r1.p(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        a0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        if (r6 != 35) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
        b0();
        r5 = r5.u(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r5 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
        r5 = r1.f15388r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
        r1.p(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h0(boolean r13) {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            v6.h r5 = r12.f12712u
            boolean r3 = r5.t(r3)
            if (r3 == 0) goto La7
            long r3 = (long) r1
            v6.f r1 = r12.f12713v
            byte r6 = r1.y(r3)
            r7 = 10
            if (r6 == r7) goto La4
            r7 = 32
            if (r6 == r7) goto La4
            r7 = 13
            if (r6 == r7) goto La4
            r7 = 9
            if (r6 != r7) goto L26
            goto La4
        L26:
            r1.p(r3)
            v6.i r2 = n5.o.f12710D
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8b
            r10 = 2
            boolean r10 = r5.t(r10)
            if (r10 != 0) goto L3c
            return r6
        L3c:
            r12.b0()
            byte r10 = r1.y(r7)
            r11 = 42
            if (r10 == r11) goto L60
            if (r10 == r9) goto L4a
            return r6
        L4a:
            r1.readByte()
            r1.readByte()
            long r5 = r5.u(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5a
            long r5 = r5 + r7
            goto L5c
        L5a:
            long r5 = r1.f15388r
        L5c:
            r1.p(r5)
            goto L1
        L60:
            r1.readByte()
            r1.readByte()
            v6.i r2 = n5.o.f12711E
            long r5 = r5.J(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L72
            r3 = 1
            goto L73
        L72:
            r3 = r0
        L73:
            if (r3 == 0) goto L7b
            byte[] r2 = r2.f15390q
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7d
        L7b:
            long r5 = r1.f15388r
        L7d:
            r1.p(r5)
            if (r3 == 0) goto L84
            goto L1
        L84:
            java.lang.String r13 = "Unterminated comment"
            r12.a0(r13)
            r13 = 0
            throw r13
        L8b:
            r9 = 35
            if (r6 != r9) goto La3
            r12.b0()
            long r5 = r5.u(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9c
            long r5 = r5 + r7
            goto L9e
        L9c:
            long r5 = r1.f15388r
        L9e:
            r1.p(r5)
            goto L1
        La3:
            return r6
        La4:
            r1 = r2
            goto L2
        La7:
            if (r13 != 0) goto Lab
            r13 = -1
            return r13
        Lab:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.o.h0(boolean):int");
    }

    public final String i0(C1344i c1344i) {
        StringBuilder sb = null;
        while (true) {
            long u7 = this.f12712u.u(c1344i);
            if (u7 != -1) {
                C1341f c1341f = this.f12713v;
                if (c1341f.y(u7) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(c1341f.a0(u7, U5.a.f3474a));
                    c1341f.readByte();
                    sb.append(k0());
                } else if (sb == null) {
                    String a02 = c1341f.a0(u7, U5.a.f3474a);
                    c1341f.readByte();
                    return a02;
                } else {
                    sb.append(c1341f.a0(u7, U5.a.f3474a));
                    c1341f.readByte();
                    return sb.toString();
                }
            } else {
                a0("Unterminated string");
                throw null;
            }
        }
    }

    public final String j0() {
        long u7 = this.f12712u.u(f12709C);
        int i7 = (u7 > (-1L) ? 1 : (u7 == (-1L) ? 0 : -1));
        C1341f c1341f = this.f12713v;
        if (i7 != 0) {
            c1341f.getClass();
            return c1341f.a0(u7, U5.a.f3474a);
        }
        return c1341f.b0();
    }

    public final char k0() {
        int i7;
        InterfaceC1343h interfaceC1343h = this.f12712u;
        if (interfaceC1343h.t(1L)) {
            C1341f c1341f = this.f12713v;
            byte readByte = c1341f.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte == 117) {
                                    if (interfaceC1343h.t(4L)) {
                                        char c5 = 0;
                                        for (int i8 = 0; i8 < 4; i8++) {
                                            byte y3 = c1341f.y(i8);
                                            char c6 = (char) (c5 << 4);
                                            if (y3 >= 48 && y3 <= 57) {
                                                i7 = y3 - 48;
                                            } else if (y3 >= 97 && y3 <= 102) {
                                                i7 = y3 - 87;
                                            } else if (y3 < 65 || y3 > 70) {
                                                a0("\\u".concat(c1341f.a0(4L, U5.a.f3474a)));
                                                throw null;
                                            } else {
                                                i7 = y3 - 55;
                                            }
                                            c5 = (char) (i7 + c6);
                                        }
                                        c1341f.p(4L);
                                        return c5;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + j());
                                }
                                a0("Invalid escape sequence: \\" + ((char) readByte));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        a0("Unterminated escape sequence");
        throw null;
    }

    public final void l0(C1344i c1344i) {
        while (true) {
            long u7 = this.f12712u.u(c1344i);
            if (u7 != -1) {
                C1341f c1341f = this.f12713v;
                byte y3 = c1341f.y(u7);
                c1341f.p(u7 + 1);
                if (y3 == 92) {
                    k0();
                } else {
                    return;
                }
            } else {
                a0("Unterminated string");
                throw null;
            }
        }
    }

    @Override // n5.n
    public final boolean n() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 != 2 && i7 != 4 && i7 != 18) {
            return true;
        }
        return false;
    }

    @Override // n5.n
    public final double r() {
        String j02;
        C1344i c1344i;
        double parseDouble;
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 16) {
            this.f12714w = 0;
            int[] iArr = this.f12706t;
            int i8 = this.f12703q - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f12715x;
        }
        try {
            if (i7 == 17) {
                C1341f c1341f = this.f12713v;
                c1341f.getClass();
                j02 = c1341f.a0(this.f12716y, U5.a.f3474a);
            } else {
                if (i7 == 9) {
                    c1344i = f12708B;
                } else if (i7 == 8) {
                    c1344i = f12707A;
                } else if (i7 == 10) {
                    j02 = j0();
                } else {
                    if (i7 != 11) {
                        throw new RuntimeException("Expected a double but was " + AbstractC0515y1.z(V()) + " at path " + j());
                    }
                    this.f12714w = 11;
                    parseDouble = Double.parseDouble(this.f12717z);
                    if (Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                        this.f12717z = null;
                        this.f12714w = 0;
                        int[] iArr2 = this.f12706t;
                        int i9 = this.f12703q - 1;
                        iArr2[i9] = iArr2[i9] + 1;
                        return parseDouble;
                    }
                    throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + j());
                }
                j02 = i0(c1344i);
            }
            parseDouble = Double.parseDouble(this.f12717z);
            if (Double.isNaN(parseDouble)) {
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + j());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.f12717z + " at path " + j());
        }
        this.f12717z = j02;
        this.f12714w = 11;
    }

    public final String toString() {
        return "JsonReader(" + this.f12712u + ")";
    }

    @Override // n5.n
    public final int x() {
        C1344i c1344i;
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 16) {
            long j7 = this.f12715x;
            int i8 = (int) j7;
            if (j7 == i8) {
                this.f12714w = 0;
                int[] iArr = this.f12706t;
                int i9 = this.f12703q - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new RuntimeException("Expected an int but was " + this.f12715x + " at path " + j());
        }
        if (i7 == 17) {
            C1341f c1341f = this.f12713v;
            c1341f.getClass();
            this.f12717z = c1341f.a0(this.f12716y, U5.a.f3474a);
        } else if (i7 != 9 && i7 != 8) {
            if (i7 != 11) {
                throw new RuntimeException("Expected an int but was " + AbstractC0515y1.z(V()) + " at path " + j());
            }
        } else {
            if (i7 == 9) {
                c1344i = f12708B;
            } else {
                c1344i = f12707A;
            }
            String i02 = i0(c1344i);
            this.f12717z = i02;
            try {
                int parseInt = Integer.parseInt(i02);
                this.f12714w = 0;
                int[] iArr2 = this.f12706t;
                int i10 = this.f12703q - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f12714w = 11;
        try {
            double parseDouble = Double.parseDouble(this.f12717z);
            int i11 = (int) parseDouble;
            if (i11 == parseDouble) {
                this.f12717z = null;
                this.f12714w = 0;
                int[] iArr3 = this.f12706t;
                int i12 = this.f12703q - 1;
                iArr3[i12] = iArr3[i12] + 1;
                return i11;
            }
            throw new RuntimeException("Expected an int but was " + this.f12717z + " at path " + j());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.f12717z + " at path " + j());
        }
    }

    @Override // n5.n
    public final void y() {
        int i7 = this.f12714w;
        if (i7 == 0) {
            i7 = c0();
        }
        if (i7 == 7) {
            this.f12714w = 0;
            int[] iArr = this.f12706t;
            int i8 = this.f12703q - 1;
            iArr[i8] = iArr[i8] + 1;
            return;
        }
        throw new RuntimeException("Expected null but was " + AbstractC0515y1.z(V()) + " at path " + j());
    }
}
