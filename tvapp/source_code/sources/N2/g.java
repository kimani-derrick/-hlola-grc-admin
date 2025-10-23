package N2;

import Z2.AbstractC0156a;
import Z2.y;
import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: g  reason: collision with root package name */
    public final y f2475g = new y();

    /* renamed from: h  reason: collision with root package name */
    public final f f2476h = new f();

    /* renamed from: i  reason: collision with root package name */
    public int f2477i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final int f2478j;

    /* renamed from: k  reason: collision with root package name */
    public final e[] f2479k;

    /* renamed from: l  reason: collision with root package name */
    public e f2480l;

    /* renamed from: m  reason: collision with root package name */
    public List f2481m;
    public List n;

    /* renamed from: o  reason: collision with root package name */
    public f f2482o;

    /* renamed from: p  reason: collision with root package name */
    public int f2483p;

    public g(int i7, List list) {
        this.f2478j = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b7 = ((byte[]) list.get(0))[0];
        }
        this.f2479k = new e[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f2479k[i8] = new e();
        }
        this.f2480l = this.f2479k[0];
    }

    @Override // N2.i
    public final j f() {
        List list = this.f2481m;
        this.n = list;
        list.getClass();
        return new j(0, list);
    }

    @Override // N2.i, i2.d
    public final void flush() {
        super.flush();
        this.f2481m = null;
        this.n = null;
        this.f2483p = 0;
        this.f2480l = this.f2479k[0];
        l();
        this.f2482o = null;
    }

    @Override // N2.i
    public final void g(h hVar) {
        boolean z7;
        ByteBuffer byteBuffer = hVar.f11351t;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.f2475g;
        yVar.D(limit, array);
        while (yVar.a() >= 3) {
            int u7 = yVar.u();
            int i7 = u7 & 3;
            boolean z8 = false;
            if ((u7 & 4) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            byte u8 = (byte) yVar.u();
            byte u9 = (byte) yVar.u();
            if (i7 == 2 || i7 == 3) {
                if (z7) {
                    if (i7 == 3) {
                        j();
                        int i8 = (u8 & 192) >> 6;
                        int i9 = this.f2477i;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            l();
                            AbstractC0156a.K("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2477i + " current=" + i8);
                        }
                        this.f2477i = i8;
                        int i10 = u8 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        f fVar = new f(i8, i10);
                        this.f2482o = fVar;
                        fVar.f2474e = 1;
                        fVar.f2472b[0] = u9;
                    } else {
                        if (i7 == 2) {
                            z8 = true;
                        }
                        AbstractC0156a.f(z8);
                        f fVar2 = this.f2482o;
                        if (fVar2 == null) {
                            AbstractC0156a.q("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            int i11 = fVar2.f2474e;
                            byte[] bArr = fVar2.f2472b;
                            bArr[i11] = u8;
                            fVar2.f2474e = i11 + 2;
                            bArr[i11 + 1] = u9;
                        }
                    }
                    f fVar3 = this.f2482o;
                    if (fVar3.f2474e == (fVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // N2.i
    public final boolean i() {
        if (this.f2481m != this.n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i7;
        int i8;
        String str;
        boolean z7;
        char c5;
        int i9;
        e eVar;
        char c6;
        e eVar2;
        char c7;
        String str2;
        e eVar3;
        e eVar4;
        char c8;
        f fVar = this.f2482o;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        String str3 = "Cea708Decoder";
        if (fVar.f2474e != (fVar.d * 2) - 1) {
            AbstractC0156a.p("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f2482o.d * 2) - 1) + ", but current index is " + this.f2482o.f2474e + " (sequence number " + this.f2482o.f2473c + ");");
        }
        f fVar2 = this.f2482o;
        byte[] bArr = fVar2.f2472b;
        int i11 = fVar2.f2474e;
        f fVar3 = this.f2476h;
        fVar3.n(i11, bArr);
        boolean z8 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int i13 = fVar3.i(3);
                int i14 = fVar3.i(5);
                if (i13 == 7) {
                    fVar3.s(i10);
                    i13 = fVar3.i(6);
                    if (i13 < 7) {
                        AbstractC0515y1.q(i13, "Invalid extended service number: ", str3);
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        AbstractC0156a.K(str3, "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f2478j) {
                    fVar3.t(i14);
                } else {
                    int g7 = (i14 * 8) + fVar3.g();
                    while (fVar3.g() < g7) {
                        int i15 = fVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 != i12) {
                                        if (i15 != 8) {
                                            switch (i15) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f2480l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i15 >= 17 && i15 <= 23) {
                                                        AbstractC0156a.K(str3, "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                        fVar3.s(8);
                                                        break;
                                                    } else if (i15 >= 24 && i15 <= 31) {
                                                        AbstractC0156a.K(str3, "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        fVar3.s(16);
                                                        break;
                                                    } else {
                                                        AbstractC0515y1.q(i15, "Invalid C0 command: ", str3);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f2480l.f2453b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f2481m = k();
                                    }
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = g7;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    eVar4 = this.f2480l;
                                    c8 = 9835;
                                } else {
                                    eVar4 = this.f2480l;
                                    c8 = (char) (i15 & 255);
                                }
                                eVar4.a(c8);
                                i9 = i10;
                                i7 = i12;
                                i8 = g7;
                                z8 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f2479k;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            z7 = true;
                                            int i16 = i15 - 128;
                                            if (this.f2483p != i16) {
                                                this.f2483p = i16;
                                                this.f2480l = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            z7 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.h()) {
                                                    e eVar5 = eVarArr[8 - i17];
                                                    eVar5.f2452a.clear();
                                                    eVar5.f2453b.clear();
                                                    eVar5.f2464p = -1;
                                                    eVar5.f2465q = -1;
                                                    eVar5.f2466r = -1;
                                                    eVar5.f2468t = -1;
                                                    eVar5.f2470v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i18].d = true;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 138:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i19].d = false;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 139:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i20].d = !eVar3.d;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 140:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 141:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            fVar3.s(8);
                                            z7 = true;
                                            break;
                                        case 142:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            z7 = true;
                                            break;
                                        case 143:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            l();
                                            z7 = true;
                                            break;
                                        case 144:
                                            str2 = str3;
                                            i8 = g7;
                                            if (this.f2480l.f2454c) {
                                                fVar3.i(4);
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                boolean h7 = fVar3.h();
                                                boolean h8 = fVar3.h();
                                                i7 = 3;
                                                fVar3.i(3);
                                                fVar3.i(3);
                                                this.f2480l.e(h7, h8);
                                                z7 = true;
                                                break;
                                            }
                                            fVar3.s(16);
                                            i7 = 3;
                                            z7 = true;
                                        case 145:
                                            str2 = str3;
                                            i8 = g7;
                                            if (!this.f2480l.f2454c) {
                                                fVar3.s(24);
                                            } else {
                                                int c9 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                int c10 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.s(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                this.f2480l.f(c9, c10);
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                        case 146:
                                            str2 = str3;
                                            i8 = g7;
                                            if (this.f2480l.f2454c) {
                                                fVar3.s(4);
                                                int i22 = fVar3.i(4);
                                                fVar3.s(2);
                                                fVar3.i(6);
                                                e eVar6 = this.f2480l;
                                                if (eVar6.f2470v != i22) {
                                                    eVar6.a('\n');
                                                }
                                                eVar6.f2470v = i22;
                                                i7 = 3;
                                                z7 = true;
                                                break;
                                            }
                                            fVar3.s(16);
                                            i7 = 3;
                                            z7 = true;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0515y1.q(i15, "Invalid C1 command: ", str3);
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g7;
                                            z7 = true;
                                            break;
                                        case 151:
                                            str2 = str3;
                                            i8 = g7;
                                            if (!this.f2480l.f2454c) {
                                                fVar3.s(32);
                                            } else {
                                                int c11 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.i(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                fVar3.h();
                                                fVar3.h();
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                int i23 = fVar3.i(2);
                                                fVar3.s(8);
                                                e eVar7 = this.f2480l;
                                                eVar7.f2463o = c11;
                                                eVar7.f2461l = i23;
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            e eVar8 = eVarArr[i24];
                                            fVar3.s(i10);
                                            boolean h9 = fVar3.h();
                                            boolean h10 = fVar3.h();
                                            fVar3.h();
                                            int i25 = fVar3.i(i12);
                                            boolean h11 = fVar3.h();
                                            int i26 = fVar3.i(7);
                                            int i27 = fVar3.i(8);
                                            int i28 = fVar3.i(4);
                                            int i29 = fVar3.i(4);
                                            fVar3.s(i10);
                                            i8 = g7;
                                            fVar3.i(6);
                                            fVar3.s(i10);
                                            int i30 = fVar3.i(3);
                                            str2 = str3;
                                            int i31 = fVar3.i(3);
                                            eVar8.f2454c = true;
                                            eVar8.d = h9;
                                            eVar8.f2460k = h10;
                                            eVar8.f2455e = i25;
                                            eVar8.f = h11;
                                            eVar8.f2456g = i26;
                                            eVar8.f2457h = i27;
                                            eVar8.f2458i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar8.f2459j != i32) {
                                                eVar8.f2459j = i32;
                                                while (true) {
                                                    ArrayList arrayList = eVar8.f2452a;
                                                    if ((h10 && arrayList.size() >= eVar8.f2459j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar8.f2462m != i30) {
                                                eVar8.f2462m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.f2445C[i33];
                                                boolean z9 = e.f2444B[i33];
                                                int i35 = e.f2451z[i33];
                                                int i36 = e.f2443A[i33];
                                                int i37 = e.f2450y[i33];
                                                eVar8.f2463o = i34;
                                                eVar8.f2461l = i37;
                                            }
                                            if (i31 != 0 && eVar8.n != i31) {
                                                eVar8.n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.f2447E[i38];
                                                int i40 = e.f2446D[i38];
                                                eVar8.e(false, false);
                                                eVar8.f(e.f2448w, e.F[i38]);
                                            }
                                            if (this.f2483p != i24) {
                                                this.f2483p = i24;
                                                this.f2480l = eVarArr[i24];
                                            }
                                            i7 = 3;
                                            z7 = true;
                                            break;
                                    }
                                } else {
                                    str2 = str3;
                                    i7 = i12;
                                    i8 = g7;
                                    z7 = true;
                                    if (i15 <= 255) {
                                        this.f2480l.a((char) (i15 & 255));
                                    } else {
                                        str = str2;
                                        AbstractC0515y1.q(i15, "Invalid base command: ", str);
                                        i9 = 2;
                                        c5 = 7;
                                    }
                                }
                                z8 = z7;
                                str = str2;
                                i9 = 2;
                                c5 = 7;
                            }
                            c5 = 7;
                            str = str3;
                            z7 = true;
                        } else {
                            i7 = i12;
                            i8 = g7;
                            str = str3;
                            z7 = true;
                            int i41 = fVar3.i(8);
                            c5 = 7;
                            if (i41 <= 31) {
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        fVar3.s(8);
                                    } else if (i41 <= 23) {
                                        fVar3.s(16);
                                    } else if (i41 <= 31) {
                                        fVar3.s(24);
                                    }
                                }
                            } else if (i41 <= 127) {
                                if (i41 != 32) {
                                    if (i41 != 33) {
                                        if (i41 != 37) {
                                            if (i41 != 42) {
                                                if (i41 != 44) {
                                                    if (i41 != 63) {
                                                        if (i41 != 57) {
                                                            if (i41 != 58) {
                                                                if (i41 != 60) {
                                                                    if (i41 != 61) {
                                                                        switch (i41) {
                                                                            case 48:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 9608;
                                                                                break;
                                                                            case 49:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 8216;
                                                                                break;
                                                                            case 50:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 8217;
                                                                                break;
                                                                            case 51:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 8220;
                                                                                break;
                                                                            case 52:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 8221;
                                                                                break;
                                                                            case 53:
                                                                                eVar2 = this.f2480l;
                                                                                c7 = 8226;
                                                                                break;
                                                                            default:
                                                                                switch (i41) {
                                                                                    case 118:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 8539;
                                                                                        break;
                                                                                    case 119:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 8540;
                                                                                        break;
                                                                                    case 120:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 8541;
                                                                                        break;
                                                                                    case 121:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 8542;
                                                                                        break;
                                                                                    case 122:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9474;
                                                                                        break;
                                                                                    case 123:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9488;
                                                                                        break;
                                                                                    case 124:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9492;
                                                                                        break;
                                                                                    case 125:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9472;
                                                                                        break;
                                                                                    case 126:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9496;
                                                                                        break;
                                                                                    case 127:
                                                                                        eVar2 = this.f2480l;
                                                                                        c7 = 9484;
                                                                                        break;
                                                                                    default:
                                                                                        AbstractC0515y1.q(i41, "Invalid G2 character: ", str);
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        eVar2 = this.f2480l;
                                                                        c7 = 8480;
                                                                    }
                                                                } else {
                                                                    eVar2 = this.f2480l;
                                                                    c7 = 339;
                                                                }
                                                            } else {
                                                                eVar2 = this.f2480l;
                                                                c7 = 353;
                                                            }
                                                        } else {
                                                            eVar2 = this.f2480l;
                                                            c7 = 8482;
                                                        }
                                                    } else {
                                                        eVar2 = this.f2480l;
                                                        c7 = 376;
                                                    }
                                                } else {
                                                    eVar2 = this.f2480l;
                                                    c7 = 338;
                                                }
                                            } else {
                                                eVar2 = this.f2480l;
                                                c7 = 352;
                                            }
                                        } else {
                                            eVar2 = this.f2480l;
                                            c7 = 8230;
                                        }
                                        eVar2.a(c7);
                                    } else {
                                        this.f2480l.a((char) 160);
                                    }
                                } else {
                                    this.f2480l.a(' ');
                                }
                                z8 = true;
                            } else if (i41 <= 159) {
                                if (i41 <= 135) {
                                    fVar3.s(32);
                                } else if (i41 <= 143) {
                                    fVar3.s(40);
                                } else if (i41 <= 159) {
                                    i9 = 2;
                                    fVar3.s(2);
                                    fVar3.s(fVar3.i(6) * 8);
                                }
                            } else {
                                i9 = 2;
                                if (i41 <= 255) {
                                    if (i41 == 160) {
                                        eVar = this.f2480l;
                                        c6 = 13252;
                                    } else {
                                        AbstractC0515y1.q(i41, "Invalid G3 character: ", str);
                                        eVar = this.f2480l;
                                        c6 = '_';
                                    }
                                    eVar.a(c6);
                                    z8 = true;
                                } else {
                                    AbstractC0515y1.q(i41, "Invalid extended command: ", str);
                                }
                            }
                            i9 = 2;
                        }
                        i12 = i7;
                        str3 = str;
                        g7 = i8;
                        i10 = i9;
                    }
                }
            }
        }
        if (z8) {
            this.f2481m = k();
        }
        this.f2482o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.g.k():java.util.List");
    }

    public final void l() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f2479k[i7].d();
        }
    }
}
