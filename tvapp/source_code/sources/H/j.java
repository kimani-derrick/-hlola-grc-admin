package H;

import L.s;
import O3.AbstractC0071o;
import O3.AbstractC0072p;
import O3.O;
import O3.P;
import Z2.y;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e5.C0657b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.C0943h;
import w2.InterfaceC1401w;
/* loaded from: classes.dex */
public final class j implements Q0.i, InterfaceC1401w, s {

    /* renamed from: q  reason: collision with root package name */
    public int f793q;

    /* renamed from: r  reason: collision with root package name */
    public Object f794r;

    public j(int i7) {
        switch (i7) {
            case 4:
                this.f794r = new long[32];
                return;
            case 5:
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.f794r = new LinkedHashMap();
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f794r = new y(8);
                return;
            case 8:
                this.f794r = new ArrayList();
                this.f793q = 128;
                return;
        }
    }

    public static boolean o(int i7, int i8, boolean z7) {
        if ((i7 > i8 && z7) || (i7 < 0 && !z7)) {
            return true;
        }
        return false;
    }

    @Override // Q0.i
    public synchronized void A(Q0.b bVar, Bitmap bitmap, Map map, int i7) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f794r;
            Object obj = linkedHashMap.get(bVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(bVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            Q0.g gVar = new Q0.g(identityHashCode, new WeakReference(bitmap), map, i7);
            int size = arrayList.size();
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    Q0.g gVar2 = (Q0.g) arrayList.get(i8);
                    if (i7 >= gVar2.d) {
                        if (gVar2.f2843a == identityHashCode && gVar2.f2844b.get() == bitmap) {
                            arrayList.set(i8, gVar);
                        } else {
                            arrayList.add(i8, gVar);
                        }
                    } else {
                        i8++;
                    }
                } else {
                    arrayList.add(gVar);
                    break;
                }
            }
            int i9 = this.f793q;
            this.f793q = i9 + 1;
            if (i9 >= 10) {
                k();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w2.InterfaceC1401w
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // L.s
    public boolean b(View view) {
        ((BottomSheetBehavior) this.f794r).y(this.f793q);
        return true;
    }

    @Override // Q0.i
    public synchronized void c(int i7) {
        if (i7 >= 10 && i7 != 20) {
            k();
        }
    }

    @Override // Q0.i
    public synchronized Q0.c d(Q0.b bVar) {
        Q0.c cVar;
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f794r).get(bVar);
            Q0.c cVar2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Q0.g gVar = (Q0.g) arrayList.get(i7);
                Bitmap bitmap = (Bitmap) gVar.f2844b.get();
                if (bitmap != null) {
                    cVar = new Q0.c(bitmap, gVar.f2845c);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar2 = cVar;
                    break;
                }
                i7++;
            }
            int i8 = this.f793q;
            this.f793q = i8 + 1;
            if (i8 >= 10) {
                k();
            }
            return cVar2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // w2.InterfaceC1401w
    public int e() {
        if (((MediaCodecInfo[]) this.f794r) == null) {
            this.f794r = new MediaCodecList(this.f793q).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f794r).length;
    }

    @Override // w2.InterfaceC1401w
    public MediaCodecInfo f(int i7) {
        if (((MediaCodecInfo[]) this.f794r) == null) {
            this.f794r = new MediaCodecList(this.f793q).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f794r)[i7];
    }

    @Override // w2.InterfaceC1401w
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // w2.InterfaceC1401w
    public boolean h() {
        return true;
    }

    public void i(long j7) {
        int i7 = this.f793q;
        long[] jArr = (long[]) this.f794r;
        if (i7 == jArr.length) {
            this.f794r = Arrays.copyOf(jArr, i7 * 2);
        }
        int i8 = this.f793q;
        this.f793q = i8 + 1;
        ((long[]) this.f794r)[i8] = j7;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [O3.o, O3.P] */
    public P j() {
        Map d = ((AbstractC0072p) this.f794r).d();
        O o7 = new O(this.f793q);
        ?? abstractC0071o = new AbstractC0071o();
        if (d.isEmpty()) {
            abstractC0071o.f2617t = d;
            abstractC0071o.f2619v = o7;
            return abstractC0071o;
        }
        throw new IllegalArgumentException();
    }

    public void k() {
        Bitmap bitmap;
        WeakReference weakReference;
        this.f793q = 0;
        Iterator it = ((LinkedHashMap) this.f794r).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                Q0.g gVar = (Q0.g) A5.k.X(arrayList);
                if (gVar != null && (weakReference = gVar.f2844b) != null) {
                    bitmap = (Bitmap) weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    int i9 = i8 - i7;
                    if (((Q0.g) arrayList.get(i9)).f2844b.get() == null) {
                        arrayList.remove(i9);
                        i7++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0080, code lost:
        if (o(r7, r14, r13) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(int r11, d5.l r12, boolean r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.j.l(int, d5.l, boolean, int, boolean):int");
    }

    public long m(int i7) {
        if (i7 >= 0 && i7 < this.f793q) {
            return ((long[]) this.f794r)[i7];
        }
        StringBuilder o7 = AbstractC0515y1.o(i7, "Invalid index ", ", size is ");
        o7.append(this.f793q);
        throw new IndexOutOfBoundsException(o7.toString());
    }

    public synchronized List n() {
        return Collections.unmodifiableList(new ArrayList((ArrayList) this.f794r));
    }

    public long p(C0943h c0943h) {
        y yVar = (y) this.f794r;
        int i7 = 0;
        c0943h.i(yVar.f4691a, 0, 1, false);
        int i8 = yVar.f4691a[0] & 255;
        if (i8 == 0) {
            return Long.MIN_VALUE;
        }
        int i9 = 128;
        int i10 = 0;
        while ((i8 & i9) == 0) {
            i9 >>= 1;
            i10++;
        }
        int i11 = i8 & (~i9);
        c0943h.i(yVar.f4691a, 1, i10, false);
        while (i7 < i10) {
            i7++;
            i11 = (yVar.f4691a[i7] & 255) + (i11 << 8);
        }
        this.f793q = i10 + 1 + this.f793q;
        return i11;
    }

    public void q(int i7, d5.l lVar) {
        M5.g.f(lVar, "spanSizeLookup");
        C0657b c0657b = (C0657b) this.f794r;
        int i8 = c0657b.f10148b;
        if (i8 != 1 && lVar != d5.l.f9263e) {
            int a7 = lVar.a(i7, i8);
            if (1 == c0657b.f10148b) {
                return;
            }
            this.f793q = a7;
        }
    }

    public synchronized boolean r(List list) {
        ((ArrayList) this.f794r).clear();
        if (list.size() > this.f793q) {
            Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f793q, null);
            return ((ArrayList) this.f794r).addAll(list.subList(0, this.f793q));
        }
        return ((ArrayList) this.f794r).addAll(list);
    }

    public /* synthetic */ j(int i7, Serializable serializable) {
        this.f793q = i7;
        this.f794r = serializable;
    }

    public /* synthetic */ j(int i7, Object obj) {
        this.f794r = obj;
        this.f793q = i7;
    }
}
