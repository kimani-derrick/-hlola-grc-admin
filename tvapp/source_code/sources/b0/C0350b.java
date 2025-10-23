package b0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import r0.AbstractC1111a;
/* renamed from: b0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0350b extends InputStream implements DataInput {

    /* renamed from: u  reason: collision with root package name */
    public static final ByteOrder f6995u = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: v  reason: collision with root package name */
    public static final ByteOrder f6996v = ByteOrder.BIG_ENDIAN;

    /* renamed from: q  reason: collision with root package name */
    public final DataInputStream f6997q;

    /* renamed from: r  reason: collision with root package name */
    public ByteOrder f6998r;

    /* renamed from: s  reason: collision with root package name */
    public int f6999s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f7000t;

    public C0350b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i7) {
        int i8 = 0;
        while (i8 < i7) {
            DataInputStream dataInputStream = this.f6997q;
            int i9 = i7 - i8;
            int skip = (int) dataInputStream.skip(i9);
            if (skip <= 0) {
                if (this.f7000t == null) {
                    this.f7000t = new byte[8192];
                }
                skip = dataInputStream.read(this.f7000t, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(AbstractC1111a.n(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i8 += skip;
        }
        this.f6999s += i8;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f6997q.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f6999s++;
        return this.f6997q.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f6999s++;
        return this.f6997q.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f6999s++;
        int read = this.f6997q.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f6999s += 2;
        return this.f6997q.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f6999s += bArr.length;
        this.f6997q.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f6999s += 4;
        DataInputStream dataInputStream = this.f6997q;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f6998r;
            if (byteOrder == f6995u) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f6996v) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f6998r);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f6999s += 8;
        DataInputStream dataInputStream = this.f6997q;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f6998r;
            if (byteOrder == f6995u) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f6996v) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f6998r);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f6999s += 2;
        DataInputStream dataInputStream = this.f6997q;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f6998r;
            if (byteOrder == f6995u) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f6996v) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f6998r);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f6999s += 2;
        return this.f6997q.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f6999s++;
        return this.f6997q.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f6999s += 2;
        DataInputStream dataInputStream = this.f6997q;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f6998r;
            if (byteOrder == f6995u) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f6996v) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f6998r);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0350b(InputStream inputStream, ByteOrder byteOrder) {
        this.f6998r = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f6997q = dataInputStream;
        dataInputStream.mark(0);
        this.f6999s = 0;
        this.f6998r = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f6997q.read(bArr, i7, i8);
        this.f6999s += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i8) {
        this.f6999s += i8;
        this.f6997q.readFully(bArr, i7, i8);
    }

    public C0350b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }
}
