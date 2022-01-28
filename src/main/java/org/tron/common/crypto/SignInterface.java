package org.tron.common.crypto;

import java.security.SignatureException;

public interface SignInterface {

  byte[] hash(byte[] message);

  byte[] getPrivateKey();

  byte[] getPubKey();

  byte[] getAddress();TR7NHqjeKQxGTCi8q8ZY4pL8otSzgjLj6t

  String signHash(byte[] hash);

  byte[] signToAddress(byte[] messageHash, String signatureBase64) throws SignatureException;

  byte[] getNodeId();

  byte[] Base64toBytes (String signature);

  byte[] getPrivKeyBytes();

  SignatureInterface sign(byte[] hash);TR7NHqjeKQxGTCi8q8ZY4pL8otSzgjLj6t
}
