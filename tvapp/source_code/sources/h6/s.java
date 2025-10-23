package h6;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import k.C0852F;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11196a;

    /* renamed from: b  reason: collision with root package name */
    public List f11197b;

    /* renamed from: c  reason: collision with root package name */
    public int f11198c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public Object f11199e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f11200g;

    /* renamed from: h  reason: collision with root package name */
    public Object f11201h;

    /* renamed from: i  reason: collision with root package name */
    public Object f11202i;

    public s() {
        this.f11196a = 0;
        this.f = "";
        this.f11200g = "";
        this.f11198c = -1;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add("");
    }

    public t a() {
        ArrayList arrayList;
        String f;
        String str = (String) this.f11199e;
        if (str != null) {
            String f7 = n.f((String) this.f, 0, 0, false, 7);
            String f8 = n.f((String) this.f11200g, 0, 0, false, 7);
            String str2 = (String) this.f11201h;
            if (str2 != null) {
                int b7 = b();
                ArrayList arrayList2 = this.d;
                ArrayList arrayList3 = new ArrayList(A5.m.P(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(n.f((String) it.next(), 0, 0, false, 7));
                }
                List list = this.f11197b;
                String str3 = null;
                if (list == null) {
                    arrayList = null;
                } else {
                    List<String> list2 = list;
                    arrayList = new ArrayList(A5.m.P(list2));
                    for (String str4 : list2) {
                        if (str4 == null) {
                            f = null;
                        } else {
                            f = n.f(str4, 0, 0, true, 3);
                        }
                        arrayList.add(f);
                    }
                }
                String str5 = (String) this.f11202i;
                if (str5 != null) {
                    str3 = n.f(str5, 0, 0, false, 7);
                }
                return new t(str, f7, f8, str2, b7, arrayList3, arrayList, str3, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public int b() {
        int i7 = this.f11198c;
        if (i7 == -1) {
            String str = (String) this.f11199e;
            M5.g.c(str);
            if (M5.g.a(str, "http")) {
                return 80;
            }
            if (!M5.g.a(str, "https")) {
                return -1;
            }
            return 443;
        }
        return i7;
    }

    public boolean c() {
        boolean z7;
        if (this.f11198c < this.f11197b.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && !(!this.d.isEmpty())) {
            return false;
        }
        return true;
    }

    public l6.n d() {
        boolean z7;
        String str;
        int i7;
        List<InetAddress> list;
        boolean contains;
        String str2;
        if (c()) {
            ArrayList arrayList = new ArrayList();
            while (this.f11198c < this.f11197b.size()) {
                if (this.f11198c < this.f11197b.size()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C0751a c0751a = (C0751a) this.f11199e;
                if (z7) {
                    List list2 = this.f11197b;
                    int i8 = this.f11198c;
                    this.f11198c = i8 + 1;
                    Proxy proxy = (Proxy) list2.get(i8);
                    ArrayList arrayList2 = new ArrayList();
                    this.f11202i = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            M5.g.e(address, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            M5.g.f(inetSocketAddress, "<this>");
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                                str2 = "hostName";
                            } else {
                                str = address2.getHostAddress();
                                str2 = "address.hostAddress";
                            }
                            M5.g.e(str, str2);
                            i7 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(M5.g.k(address.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                        }
                    } else {
                        t tVar = c0751a.f11124h;
                        str = tVar.d;
                        i7 = tVar.f11207e;
                    }
                    if (1 <= i7 && i7 < 65536) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i7));
                        } else {
                            byte[] bArr = i6.b.f11390a;
                            M5.g.f(str, "<this>");
                            U5.d dVar = i6.b.f;
                            dVar.getClass();
                            if (dVar.f3486q.matcher(str).matches()) {
                                list = m3.g.z(InetAddress.getByName(str));
                            } else {
                                ((n) this.f11201h).getClass();
                                M5.g.f((l6.i) this.f11200g, "call");
                                List e3 = c0751a.f11119a.e(str);
                                if (!e3.isEmpty()) {
                                    list = e3;
                                } else {
                                    throw new UnknownHostException(c0751a.f11119a + " returned no addresses for " + str);
                                }
                            }
                            for (InetAddress inetAddress : list) {
                                arrayList2.add(new InetSocketAddress(inetAddress, i7));
                            }
                        }
                        for (InetSocketAddress inetSocketAddress2 : (List) this.f11202i) {
                            J j7 = new J((C0751a) this.f11199e, proxy, inetSocketAddress2);
                            C0852F c0852f = (C0852F) this.f;
                            synchronized (c0852f) {
                                contains = ((LinkedHashSet) c0852f.f11874r).contains(j7);
                            }
                            if (contains) {
                                this.d.add(j7);
                            } else {
                                arrayList.add(j7);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i7 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + c0751a.f11124h.d + "; exhausted proxy configurations: " + this.f11197b);
                }
            }
            if (arrayList.isEmpty()) {
                A5.q.R(this.d, arrayList);
                this.d.clear();
            }
            return new l6.n(arrayList);
        }
        throw new NoSuchElementException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:122:0x028a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void e(h6.t r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.s.e(h6.t, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (r1 != r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.s.toString():java.lang.String");
    }

    public s(C0751a c0751a, C0852F c0852f, l6.i iVar, n nVar) {
        List l7;
        this.f11196a = 1;
        M5.g.f(c0751a, "address");
        M5.g.f(c0852f, "routeDatabase");
        M5.g.f(iVar, "call");
        M5.g.f(nVar, "eventListener");
        this.f11199e = c0751a;
        this.f = c0852f;
        this.f11200g = iVar;
        this.f11201h = nVar;
        A5.t tVar = A5.t.f135q;
        this.f11197b = tVar;
        this.f11202i = tVar;
        this.d = new ArrayList();
        t tVar2 = c0751a.f11124h;
        M5.g.f(tVar2, "url");
        URI h7 = tVar2.h();
        if (h7.getHost() == null) {
            l7 = i6.b.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0751a.f11123g.select(h7);
            List<Proxy> list = select;
            if (list == null || list.isEmpty()) {
                l7 = i6.b.l(Proxy.NO_PROXY);
            } else {
                M5.g.e(select, "proxiesOrNull");
                l7 = i6.b.x(select);
            }
        }
        this.f11197b = l7;
        this.f11198c = 0;
    }
}
