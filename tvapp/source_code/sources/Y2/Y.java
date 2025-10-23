package Y2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class Y extends AbstractC0138g {

    /* renamed from: A  reason: collision with root package name */
    public InetAddress f4368A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f4369B;

    /* renamed from: C  reason: collision with root package name */
    public int f4370C;

    /* renamed from: u  reason: collision with root package name */
    public final int f4371u;

    /* renamed from: v  reason: collision with root package name */
    public final byte[] f4372v;

    /* renamed from: w  reason: collision with root package name */
    public final DatagramPacket f4373w;

    /* renamed from: x  reason: collision with root package name */
    public Uri f4374x;

    /* renamed from: y  reason: collision with root package name */
    public DatagramSocket f4375y;

    /* renamed from: z  reason: collision with root package name */
    public MulticastSocket f4376z;

    public Y() {
        super(true);
        this.f4371u = 8000;
        byte[] bArr = new byte[2000];
        this.f4372v = bArr;
        this.f4373w = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        Uri uri = c0148q.f4422a;
        this.f4374x = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f4374x.getPort();
        k();
        try {
            this.f4368A = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4368A, port);
            if (this.f4368A.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4376z = multicastSocket;
                multicastSocket.joinGroup(this.f4368A);
                this.f4375y = this.f4376z;
            } else {
                this.f4375y = new DatagramSocket(inetSocketAddress);
            }
            this.f4375y.setSoTimeout(this.f4371u);
            this.f4369B = true;
            l(c0148q);
            return -1L;
        } catch (IOException e3) {
            throw new C0145n(2001, e3);
        } catch (SecurityException e7) {
            throw new C0145n(2006, e7);
        }
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4374x = null;
        MulticastSocket multicastSocket = this.f4376z;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f4368A;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f4376z = null;
        }
        DatagramSocket datagramSocket = this.f4375y;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4375y = null;
        }
        this.f4368A = null;
        this.f4370C = 0;
        if (this.f4369B) {
            this.f4369B = false;
            h();
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4374x;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f4370C;
        DatagramPacket datagramPacket = this.f4373w;
        if (i9 == 0) {
            try {
                DatagramSocket datagramSocket = this.f4375y;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f4370C = length;
                a(length);
            } catch (SocketTimeoutException e3) {
                throw new C0145n(2002, e3);
            } catch (IOException e7) {
                throw new C0145n(2001, e7);
            }
        }
        int length2 = datagramPacket.getLength();
        int i10 = this.f4370C;
        int min = Math.min(i10, i8);
        System.arraycopy(this.f4372v, length2 - i10, bArr, i7, min);
        this.f4370C -= min;
        return min;
    }
}
