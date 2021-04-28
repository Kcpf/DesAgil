import React from 'react';
import { View, StyleSheet } from 'react-native';

import Top from './Top';
import Bottom from './Bottom';

export default function Main(props) {
    return (
        <View style={styles.container}>
            <Top text="Hello World"/>
            <Bottom title="Click Here"/>
        </View>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#ffffff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});