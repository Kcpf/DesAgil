import React from 'react';
import { Image, Text, StyleSheet } from 'react-native';

export default function Top(props) {
    return (
        <>
            <Text>{props.text}</Text>
            <Image style={styles.icon} source={require('../assets/icon.png')}></Image>
        </>
    );
};

const styles = StyleSheet.create({
    icon: {
        width: 50,
        height: 50,
    },
});